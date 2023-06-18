import java.text.SimpleDateFormat;
import java.util.Date;

class FormatDate{
    public String getfdate(Date d){
        final String TDP="mm/dd/yyyy";
        SimpleDateFormat sdf=new SimpleDateFormat(TDP);
        return sdf.format(d);
    }
}
public class NewClass {
    
    public static void main(String args[]){
        FormatDate fd=new FormatDate();
        Date now =new Date();
        System.out.println(now);
        
        String reqfmt =fd.getfdate(now);
        System.out.println(reqfmt);
    }

    
}
