package StructuralPatterns.AdapterPattern;

import StructuralPatterns.AdapterPattern.Adaptee.WeightMachineForBabies;
import StructuralPatterns.AdapterPattern.Adapter.WeightMachineAdapter;
import StructuralPatterns.AdapterPattern.Adapter.WeightMachineAdapterImpl;


public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}



/*
convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't
otherwise because of incompatible interface.
 */