package com.codedifferently.stayready;

public class Main {

    public String dollarToEuro(double dollarAmount){
        double mult = dollarAmount * 0.8861;
        return String.format("€%.2f", (mult));
    }

    public String euroToDollar(double euroAmount){
        double mult = (euroAmount*1.1286);
        return String.format("$%.2f", (mult));
    }

    public String euroToPound(double euroAmount){
        double mult = euroAmount * 0.89923;
        return String.format("£%.2f", (mult));
    }

    public String poundToRupee(double poundAmount){
        double mult = poundAmount * 94.13;
        return String.format("₹%.2f", (mult));
    }

    public String rupeeToCanadian(double rupeeAmount){
        double mult = rupeeAmount * 0.0181;
        return String.format("C$%.2f", (mult));
    }

    public String canadianToSingapore(double canadianAmount){
        double mult = canadianAmount * 1.028;
        return String.format("SGD%.2f", (mult));
    }

    public String singaporeToFranc(double singaporeAmount){
        double mult = singaporeAmount * 0.677;
        return String.format("SFr%.2f", (mult));
    }

    public String francToRinggit(double francAmount){
        double mult = francAmount * 4.536;
        return String.format("RM%.2f", (mult));
        
    }

    public String ringgitToYen(double ringgitAmount){
        double mult = ringgitAmount *25.09;
        return String.format("¥%.2f", (mult));
        
    }

    public String yenToYuan(double yenAmount){
        double mult = yenAmount * 0.0656;
        return String.format("¥%.2f", (mult));
    }
    
    //how much you have multiplied by exchange rate
}

