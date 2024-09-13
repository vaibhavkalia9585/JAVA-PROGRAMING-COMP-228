class Comp228{
    public static void main(String[]args){
        Singer singerOne = new Singer();
        System.out.println(singerOne);
        System.out.println("***************************************");
        singerOne.setAll("Vaibhav Kalia","20 january,2005","940 Progress Avenue",25,9);
        System.out.println(singerOne);
        //Getter Setter concept
        singerOne.setNameOfTheSinger("Kendrik Lamar");
        singerOne.setDateOfBirth("17 June,1987");
        singerOne.setAddressOfTheSinger("2220 Colorado Avenue 5th Floor Santa Monica");
        singerOne.setTotalAlbums(5);
        singerOne.setIdOfTheSinger(1);
        System.out.println("***************************************");
        System.out.println("Name of the artist==>"+singerOne.getNameOfTheSinger());
        System.out.println("Date of Birth of The Artist==>"+singerOne.getDateOfBirth());
        System.out.println("Address of The Artist==>"+singerOne.getAddressOfTheSinger());
        System.out.println("Total number of albums==>"+singerOne.getTotalAlbums());
        System.out.println("Id of The Artist==>"+singerOne.getIdOfTheSinger());

    }

}
class Singer{
    private String nameOfTheSinger;
    private String dateOfBirth;
    private String addressOfTheSinger;
    private int totalAlbums;
    private int idOfTheSinger;

    public Singer(String nameOfTheSinger, String dateOfBirth, String addressOfTheSinger, int totalAlbums, int idOfTheSinger) {
        this.nameOfTheSinger = nameOfTheSinger;
        this.dateOfBirth = dateOfBirth;
        this.addressOfTheSinger = addressOfTheSinger;
        this.totalAlbums = totalAlbums;
        this.idOfTheSinger = idOfTheSinger;
    }
    public Singer(){

    }
    public void setNameOfTheSinger(String nameOfTheSinger) {
        this.nameOfTheSinger = nameOfTheSinger;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddressOfTheSinger(String addressOfTheSinger) {
        this.addressOfTheSinger = addressOfTheSinger;
    }
    public void setTotalAlbums(int totalAlbums) {
        this.totalAlbums = totalAlbums;
    }
    public void setIdOfTheSinger(int idOfTheSinger) {
        this.idOfTheSinger = idOfTheSinger;
    }


    public String getNameOfTheSinger() {
        return nameOfTheSinger;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getAddressOfTheSinger() {
        return addressOfTheSinger;
    }
    public int getTotalAlbums() {
        return totalAlbums;
    }
    public int getIdOfTheSinger() {
        return idOfTheSinger;
    }
    public void setAll(String nameOfTheSinger, String dateOfBirth, String addressOfTheSinger,int totalAlbums, int idOfTheSinger) {
        this.nameOfTheSinger = nameOfTheSinger;
        this.dateOfBirth = dateOfBirth;
        this.addressOfTheSinger = addressOfTheSinger;
        this.totalAlbums = totalAlbums;
        this.idOfTheSinger = idOfTheSinger;



    }
    public String toString(){
        return("Id of the singer==>"+idOfTheSinger+
                "\n"+"Name of the Singer==>"+nameOfTheSinger+
                "\n"+"Date of Birth Of The Singer==>"+dateOfBirth+
                "\n"+"Address of the singer==>"+addressOfTheSinger+
                "\n"+"Total number of albums sold by the singer==>"+totalAlbums);
    }
}
