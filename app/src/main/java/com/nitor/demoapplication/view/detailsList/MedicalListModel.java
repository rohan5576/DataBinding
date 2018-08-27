package com.nitor.demoapplication.view.detailsList;

import java.util.ArrayList;
import java.util.List;

public class MedicalListModel {


    public String name;
    public  String description;
    public String price;

    public MedicalListModel(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static List<MedicalListModel> prepareData(){
        List<MedicalListModel> medicalListModels = new ArrayList<>();

        MedicalListModel medicalListModel = new MedicalListModel("Abacavir sulfate", "A carbocyclic nucleoside with potent selective anti-HIV activity.",  "$388");
        medicalListModels.add(medicalListModel);
        MedicalListModel  medicalListModel1 = new MedicalListModel("ACAMPROSATE CALCIUM", "Reduces voluntary ethanol intake by rats. ",  "$388");
        medicalListModels.add(medicalListModel1);
        MedicalListModel  medicalListModel2 = new MedicalListModel("ACAMPROSATE CALCIUM", "Product of the oxidation of ethanol and of the destructive distillation of wood. It is used locally, occasionally internally, as a counterirritant and also as a reagent. . ",  "$388");
        medicalListModels.add(medicalListModel2);
        MedicalListModel  medicalListModel3 = new MedicalListModel(" ACETIC ACID", "Reduces voluntary ethanol intake by rats. ",  "$388");
        medicalListModels.add(medicalListModel3);
        MedicalListModel  medicalListModel4 = new MedicalListModel("ACAMPROSATE CALCIUM", "Product of the oxidation of ethanol and of the destructive distillation of wood. It is used locally, occasionally internally, as a counterirritant and also as a reagent. . ",  "$388");
        medicalListModels.add(medicalListModel4);
        return medicalListModels;
    }
}
