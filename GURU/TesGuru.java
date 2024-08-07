//Driver class
public class TesGuru {
    public static void main(String[] args) {
        //membuat objek
        Guru aulia = new Guru();
        Guru bagus = new Guru();
        Guru nasikin = new Guru();
        Guru feni = new Guru();
        Guru asry = new Guru();

        aulia.id = 1;
        aulia.nama = "Aulia Mas'adah S.Kom";
        aulia.mapel = "Dasar Program Keahlian(RPL)";
        aulia.alamat = "Malang";

        bagus.id = 2;
        bagus.nama = "Muhammad Bagus Arifin S.Pd";
        bagus.mapel = "Informatika";
        bagus.alamat = "Malang";

        nasikin.id = 3;
        nasikin.nama = "Ahmad Nasikin M.Pd";
        nasikin.mapel = "Pendidikan Agama Islam";
        nasikin.alamat = "Malang";
        
        feni.id = 4;
        feni.nama = "Feniliya Mayrini";
        feni.mapel = "Matematika";
        feni.alamat = "Malang";

        asry.id = 5;
        asry.nama = "Asry Wahyunignsih S.Pd";
        asry.mapel = "Bahasa Indonesia";
        asry.alamat = "Malang";

        System.out.println("Ini Data Bu Aulia");
        System.out.println("Id : "+aulia.id);
        System.out.println("Nama : "+aulia.nama);
        System.out.println("Mapel : "+aulia.mapel);
        System.out.println("Alamat : "+aulia.alamat);

        System.out.println("Ini Data Pak Bagus");
        System.out.println("Id : "+bagus.id);
        System.out.println("Nama : "+bagus.nama);
        System.out.println("Mapel : "+bagus.mapel);
        System.out.println("Alamat : "+bagus.alamat);

        System.out.println("Ini Data Pak Nasikin");
        System.out.println("Id : "+nasikin.id);
        System.out.println("Nama : "+nasikin.nama);
        System.out.println("Mapel : "+nasikin.mapel);
        System.out.println("Alamat : "+nasikin.alamat);

        System.out.println("Ini Data Bu Feni");
        System.out.println("Id : "+feni.id);
        System.out.println("Nama : "+feni.nama);
        System.out.println("Mapel : "+feni.mapel);
        System.out.println("Alamat : "+feni.alamat);

        System.out.println("Ini Data Bu Asry");
        System.out.println("Id : "+asry.id);
        System.out.println("Nama : "+asry.nama);
        System.out.println("Mapel : "+asry.mapel);
        System.out.println("Alamat : "+asry.alamat);
     
    }
}
