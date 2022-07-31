import org.biojava.nbio.structure.*;
import org.biojava.nbio.structure.io.PDBFileReader;

import java.util.Arrays;
import java.util.List;

public class ReadPdbFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Miraj\\Downloads\\1bud.pdb";
        PDBFileReader reader = new PDBFileReader();
        try {
            Structure structure = reader.getStructure(fileName);
            Atom[] atoms = StructureTools.getAllAtomArray(structure);
            System.out.println("Set<Sphere> spheres = new HashSet<>();");
            for(int i = 0; i<atoms.length; i++){
                System.out.println("spheres.add(new Sphere(1," + atoms[i].getX() + ", " + atoms[i].getY() + ", " + atoms[i].getZ() + ",\"" + atoms[i].getElement() + "\"));");
            }
            System.out.println("return spheres;");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}