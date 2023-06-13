
package geometri;

public class Main {
    public static void main(String[] args) {
        Lingkaran bulat = new Lingkaran ();
        
        PersegiPanjang segi = new PersegiPanjang();
        
        bulat.radius =10;
        System.out.println("Luas keliling :"+bulat.luas());
        System.out.println("Keliling Lirgkaran :"+segi.keliling());
        
        
        segi.lebar = 22;
        segi.panjang = 20;
        
        System.out.println("Luas Persegi Panjang :"+segi.luas());
        System.out.println("Keliling Persegi Panjang :"+ segi.keliling());
        
        
        
    }
}
