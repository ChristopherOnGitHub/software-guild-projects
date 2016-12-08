///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package LabsWeek2;
//
//import Experiments.*;
//
///**
// *
// * @author apprentice
// */
//public class CalculatorDirector1 {
//
//    public static void main(String[] args) {
//
//        double x;
//        double y;
//        String o;
//
//        CalculatorDisplay CalculatorDisplay = new CalculatorDisplay();
//
//        do {
//            o = CalculatorDisplay.menu();
//            x = CalculatorDisplay.enterDouble();
//            y = CalculatorDisplay.enterDoubleY();
//
//            if (o.equals("q") || o.equals("Q")) {
//                CalculatorDisplay.goodbye();
//            } else if (o.equals("+")) {
//                CalculatorEngine.addition(x, y);
//            } else if (o.equals("-")) {
//                CalculatorEngine.subtraction(x, y);
//            } else if (o.equals("*")) {
//                CalculatorEngine.multiplication(x, y);
//            } else if (o.equals("/")) {
//                CalculatorEngine.division(x, y);
//            }
//        } while (!(o.equals("Q") || o.equals("q")));
//
//    }
//}
