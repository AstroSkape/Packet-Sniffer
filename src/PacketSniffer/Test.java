package PacketSniffer;

import jpcap.JpcapCaptor;

import jpcap.NetworkInterface;


public class Test 

{
      static NetworkInterface [] array ;


public static void main (String[] args)
{
   array = JpcapCaptor.getDeviceList();

   System.out.println("Available Interfaces: ");

         for (int i=1;  i<array.length ; i++)
                   
              {
                    System.out.println(i+" -> " + array[i].description);        
               }
}

}