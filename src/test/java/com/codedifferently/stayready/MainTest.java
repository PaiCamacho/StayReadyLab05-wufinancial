package com.codedifferently.stayready;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    Main main;

    @Before
    public void mainObject(){
        main = new Main();
    }

    @Test
    public void DollarToEuroTest(){
        //Given
        String expected = "€17.72";

        //When
        String actual = main.dollarToEuro(20);

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void EuroToDollarTest(){
        //Given
        String expected = "$22.57";

        //When
        String actual = main.euroToDollar(20);

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void EuroToPound(){
        //Given
        String expected = "£17.98";

        //When
        String actual = main.euroToPound(20);
        
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void PoundToRupee(){
        //Given
        String expected = "₹470.65";

        //When
        String actual = main.poundToRupee(5);
        
        //Then
        Assert.assertEquals(expected, actual);
    }

     @Test
    public void RupeetoCanadianTest(){
        //Given
        String expected = "C$1.81";

        //When
        String actual = main.rupeeToCanadian(100);

        //Then
        Assert.assertEquals(expected, actual);
    } 

    
    @Test
    public void CanadiantoSingaporeTest(){
        //Given
        String expected = "SGD20.56";

        //When
        String actual = main.canadianToSingapore(20);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SingaporetoFranc(){
         //Given
        String expected = "SFr13.54";

        //When
        String actual = main.singaporeToFranc(20);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FranctoRinggit(){
        //Given
        String expected = "RM90.72";

        //When
        String actual = main.francToRinggit(20);

        //Then
        Assert.assertEquals(expected, actual);      
    }

    @Test
    public void RinggittoYen(){
        //Given
        String expected = "¥125.45";

        //When
        String actual = main.ringgitToYen(5);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void YentoYuan(){
        //Given
        String expected = "¥3.28";

        //When
        String actual = main.yenToYuan(50);

        //Then
        Assert.assertEquals(expected, actual);
    }
 
}
