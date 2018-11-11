package Program;
import java.util.Comparator;
public class Nama implements Comparator<Mahasiswa>{
@Override
    public int compare(Mahasiswa x, Mahasiswa y)
    {
        return x.getnama().compareToIgnoreCase(y.getnama());   
    }    
}