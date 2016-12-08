/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTOs.Material;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ProductDAOImpl implements ProductDAO {

    private final String FILE_NAME = "flooringMaterials.txt";
    private final HashMap<String, Material> materialList;
    private final String DELIMITER = ",";

    public ProductDAOImpl() {
        materialList = new HashMap();
    }

    @Override
    public void loadMaterials() throws IOException {

        Scanner userInput = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

        while (userInput.hasNextLine()) {
            String asdf = userInput.nextLine();

            String[] materialProperties = asdf.split(DELIMITER);

            if (materialProperties.length != 3) {
                continue;
            }
            Material newMaterial = new Material(materialProperties[0],
                    Double.parseDouble(materialProperties[1]),
                    Double.parseDouble(materialProperties[2]));

            materialList.put(newMaterial.getType(), newMaterial);
        }

    }

    @Override
    public Collection<Material> listAll() {
        return materialList.values();
    }

}
