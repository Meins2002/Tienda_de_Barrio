package Tienda;

public class User {

    //Atributos
    private String Client_Name;
    private int Id_Client;
    private int Phone_Number;

    //contructor



    public User(String client_Name, int Id_Client, int Phone_Number) {
        this.Client_Name = client_Name;
        this.Id_Client = Id_Client;
        this.Phone_Number = Phone_Number;
    }

    // get y set
    public String getClient_Name() {
        return Client_Name;
    }

    public int getId_Client() {
        return Id_Client;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }

    public void setId_Client(int id_Client) {
        Id_Client = id_Client;
    }

    public void setClient_Name(String client_Name) {
        Client_Name = client_Name;
    }


    @Override
    public  String toString (){
        return "Datos de usuario: " + '\n' +
                "Nombre Cliente: "  + Client_Name + '\n' +
                "Numero Identificación: " + Id_Client +'\n' +
                "Numero Contacto: " + Phone_Number;
    }
}
