

import java.io.*;

public class serialSalle implements Serializable{
    // sauvegarder l’objet Salle dans un fichier donné
    public void saveSalleToSerialFile(String name_file,Salle salle){
        try{
            FileOutputStream file = new FileOutputStream(name_file);
            BufferedOutputStream buffer_Stream = new BufferedOutputStream(file);
            ObjectOutputStream obj_Stream = new ObjectOutputStream(buffer_Stream);
            try {
                obj_Stream.writeObject(salle);
                obj_Stream.flush();
                System.out.println("object : "+salle+" was serializable succefully");
            }
            finally{
                try {
                    obj_Stream.close();
                } finally {
                    file.close();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    // récupérer l’objet de type Salle
    public Salle getRealisateurToSerialFile(String name_file){
        Salle s = null;
        try{
            FileInputStream file_read = new FileInputStream(name_file);
            BufferedInputStream buffer = new BufferedInputStream(file_read);
            ObjectInputStream obj_reader = new ObjectInputStream(buffer);
            try{
                s = (Salle) obj_reader.readObject();
            }finally{
                try {
                    obj_reader.close();
                    buffer.close();
                } finally {
                    file_read.close();
                }
            }
        }
        catch(Exception err){
            err.printStackTrace();
        }
        if (s!=null) {
            System.out.println("object : "+s+" was deserializable succefully");
            return s;
        } else {
            return null;
        }
    }
}