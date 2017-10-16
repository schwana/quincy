/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.heliumsinglefile;

import java.util.ArrayList;

/**
 *
 * @author James
 */
public class Global {
    
    //Constants
    
    public static Double DepletionFactor=0.9999526;
    public static Double DepletionErr = 0.0000004;
    
    
    //Number of files loaded into the program is a constant.
    public static int NumberOfFiles;
//Store the list of He3 signals for each run file.
    public static String He3Signal;
    
    public static String Date;

    public static int IgnoreCharts=0;
    
    public static String Directory;
 
    public static ArrayList<String> DataArray = new ArrayList<>();
    public static ArrayList<String> Dates = new ArrayList<>();
    public static ArrayList<String> Ratio4He3He = new ArrayList<>();
    public static ArrayList<String> He3 = new ArrayList<>();
    public static ArrayList<String> He4 = new ArrayList<>();

    public static Double HDH = 0.010;
    
    public static int NumIgnore=6;

    //Results from RAW
    public static Double He3_average;
    public static Double He3_SD;
    public static Double He4_average;
    public static Double He4_SD;
    public static Double R_average;
    public static Double R_SD;

    public static       Double He3_bf;
    public static    Double He4_bf;
    public static    Double R_bf;
    public static    Double He3_bf_SD;
    public static    Double He4_bf_SD;
    public static    Double Ratio_bf_SD;

    public static Double sel_He3_average;
    public static Double sel_He3_SD;
    public static Double sel_He4_average;
    public static Double sel_He4_SD;
    public static Double sel_R_average;
    public static Double sel_R_SD;

    public static       Double sel_He3_bf;
    public static    Double sel_He4_bf;
    public static    Double sel_R_bf;
    public static    Double sel_He3_bf_SD;
    public static    Double sel_He4_bf_SD;
    public static    Double sel_Ratio_bf_SD;    

    
    //Blank Correction
    
    public static ArrayList<Integer> SelectedData = new ArrayList<>();
    public static ArrayList<Integer> SelectedBlanks = new ArrayList<>();
    
    public static ArrayList<String> BlankCorrected = new ArrayList<>();
    
}
