interface Animal {
    public void animalSound(); 
    public void sleep(); }
  class Pig implements Animal {
    public void animalSound() {
      System.out.println("The pig says: bow..bow");
    }
    public void sleep() {
      System.out.println("Zzz");
    }
  }

  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig(); 
      myPig.animalSound();
      myPig.sleep();
    }
  }