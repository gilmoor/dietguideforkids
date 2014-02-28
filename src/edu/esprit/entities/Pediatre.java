package edu.esprit.entities;

public class Pediatre extends Utilisateur {

    private String id_ped;
    private byte[] imagedata ;
    
    public Pediatre(){}

    public Pediatre(String id_ped, String nom_ped, String prenom_ped, String pwd_ped, int type_ped) {

        this.id_ped = id_ped;
    }

    public byte[] getImagedata() {
        return imagedata;
    }

    public void setImagedata(byte[] imagedata) {
        this.imagedata = imagedata;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pediatre other = (Pediatre) obj;
        if (this.id_ped != other.id_ped) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pediatre{" + "Nom " + super.getNom_util() + " Prenom " + super.getPrenom_util() + "}";
    }
}
