/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expt6java;

/**
 *
 * @author kathier K
 */
public class apartment {
    String address;
    String apt_no;
    int beds;
    double rent;
    public apartment(String Add,String apt,int bed,double rentval)
    {
        address=Add;
        apt_no=apt;
        beds=bed;
        rent=rentval;
    }
    void AptNoError(){
    try
    {
        if(apt_no.length()==3)
            System.out.println("Apartment Number is valid");
        else
            throw new ApartmentException("Apartment Number is Invalid");
    }
    catch(ApartmentException e)
    {
        System.out.println(e);
    }
    }
    void BedsError()
    {
        try
    {
        if(beds>1 && beds<4)
            System.out.println("Bed count is valid");
        else
            throw new ApartmentException("Bed count is Invalid");
    }
        catch(ApartmentException e)
    {
        System.out.println(e);
    }
    }
    void RentError()
    {
        try
    {
        if(rent>500 && rent<2500)
            System.out.println("Rent is valid");
        else
            throw new ApartmentException("Rent is Invalid");
    }
    catch(ApartmentException e)
    {
        System.out.println(e);
    }
    }

}

class ApartmentException extends Exception
{
    ApartmentException(String msg)
    {
       super(msg);
    }
}