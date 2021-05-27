package AirlineSystem;
public class Splash {
    public static void main(String args[])
    {
        Screen1 obj= new Screen1();
        Login obj1=new Login();
        
        obj.setVisible(true);
        try{
            for( int i=0; i<=100; i++)
        {
         Thread.sleep(40);
         obj.Per.setText(Integer.toString(i)+"%");
         obj.Bar.setValue(i);
         if(i==100)
         {
             obj.setVisible(false);
             obj1.setVisible(true);
         }
        }
            
        }
            catch(Exception e ){
                    
                    }
    }
    
}
