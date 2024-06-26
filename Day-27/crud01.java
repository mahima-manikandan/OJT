package crud01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud01 {
    private static final String URL = "jdbc:mysql://localhost:3306/sample";
    private static final String USER= "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Insert a new employee
        createEmployee(1, "John", "Doe", "john.doe@example.com", "2023-06-01");
        createEmployee(2, "surya ", "subhash", "soorya01@gmail.com", "2023-05-02");
        createEmployee(3, "arjun", "Suresh", "arjunarjun@gmail.com", "2023-03-06");

        // Read all employees
        readEmployees();

        // Read FirstName and LastName of employees hired in 2023
        readEmployeesHiredIn2023();

        // Update email of the employee with EmployeeID = 1
        updateEmployeeEmail(2, "minnu013@gmail.com");

        // Update HireDate of all employees with LastName = 'Doe'
        updateEmployeeHireDate("Doe", "2023-07-01");

        // Delete the employee with EmployeeID = 1
        deleteEmployee(1);

        // Delete all employees hired before '2023-01-01'
        deleteEmployeesHiredBefore("2023-01-01");
    }

    public static void createEmployee(int employeeID, String firstName, String lastName, String email, String hireDate) {
        String query = "INSERT INTO Employees (EmployeeID, FirstName, LastName, Email, HireDate) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, employeeID);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, email);
            preparedStatement.setDate(5, java.sql.Date.valueOf(hireDate));
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Employee added successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployees() {
        String query = "SELECT * FROM Employees";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println("Employees:");
            while (resultSet.next()) {
                int employeeID = resultSet.getInt("EmployeeID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String email = resultSet.getString("Email");
                java.sql.Date hireDate = resultSet.getDate("HireDate");
                System.out.println("EmployeeID: " + employeeID + ", FirstName: " + firstName + ", LastName: " + lastName + ", Email: " + email + ", HireDate: " + hireDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployeeByID(int employeeID) {
        String query = "SELECT * FROM Employees WHERE EmployeeID = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, employeeID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String email = resultSet.getString("Email");
                java.sql.Date hireDate = resultSet.getDate("HireDate");
                System.out.println("Updated Employee Details - EmployeeID: " + employeeID + ", FirstName: " + firstName + ", LastName: " + lastName + ", Email: " + email + ", HireDate: " + hireDate);
            } else {
                System.out.println("Employee with EmployeeID " + employeeID + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployeesHiredIn2023() {
        String query = "SELECT FirstName, LastName FROM Employees WHERE YEAR(HireDate) = 2023";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println("Employees hired in 2023:");
            while (resultSet.next()) {
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                System.out.println("FirstName: " + firstName + ", LastName: " + lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployeeEmail(int employeeID, String newEmail) {
        String query = "UPDATE Employees SET Email = ? WHERE EmployeeID = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, newEmail);
            preparedStatement.setInt(2, employeeID);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Employee email updated successfully!");
                // Show updated email
                readEmployeeByID(employeeID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployeeHireDate(String lastName, String newHireDate) {
        String query = "UPDATE Employees SET HireDate = ? WHERE LastName = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDate(1, java.sql.Date.valueOf(newHireDate));
            preparedStatement.setString(2, lastName);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Employee hire date updated successfully!");
                // Show updated hire date for all employees with LastName
                readEmployeesByLastName(lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployeesByLastName(String lastName) {
        String query = "SELECT * FROM Employees WHERE LastName = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, lastName);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Employees with LastName " + lastName + ":");
            while (resultSet.next()) {
                int employeeID = resultSet.getInt("EmployeeID");
                String firstName = resultSet.getString("FirstName");
                String email = resultSet.getString("Email");
                java.sql.Date hireDate = resultSet.getDate("HireDate");
                System.out.println("EmployeeID: " + employeeID + ", FirstName: " + firstName + ", LastName: " + lastName + ", Email: " + email + ", HireDate: " + hireDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployee(int employeeID) {
        String query = "DELETE FROM Employees WHERE EmployeeID = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, employeeID);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Employee deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployeesHiredBefore(String date) {
        String query = "DELETE FROM Employees WHERE HireDate < ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDate(1, java.sql.Date.valueOf(date));
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Employees hired before " + date + " deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
