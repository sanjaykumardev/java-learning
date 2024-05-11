public class Main {
  public static void main(String[] args)
  {
    Manualcar m=new Manualcar();
    m.turnoncar();
    m.turnoffcar();
    System.out.println(m.getcartype());

    Automaticcar a =new Automaticcar();
    a.turnoncar();
    a.turnoffcar();
    System.out.println(a.getcartype());
  } 
}
