package Program;
import java.util.Comparator;
public class IPK implements Comparator<Mahasiswa>{
    @Override
    public int compare(Mahasiswa x, Mahasiswa y){
        return Float.compare(x.getipk(), y.getipk());
    }
}