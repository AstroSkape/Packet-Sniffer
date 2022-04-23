package PacketSniffer;

import jpcap.JpcapCaptor;

import jpcap.NetworkInterface;
import jpcap.NetworkInterfaceAddress;


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
                        System.out.println("Interface Number:   " + i);
                        System.out.println("Description:              "
                              + array[i].name + "("
                              + array[i].description + ")");
                        System.out.println("Datalink Name:         "
                              + array[i].datalink_name + "("
                              + array[i].datalink_description + ")");
                        System.out.println("Mac Address:            ");
                        byte[] R = array[i].mac_address;
                        System.out.println(R.length);
                        System.out.println(array.length);
                        for (int A = 0; A < array.length-2; A++) {
                              System.out.println(Integer.toHexString(R[A] & 0xff) + ":");
                        }
                        System.out.println("Here");

                        /*NetworkInterfaceAddress[] INT = array[i].addresses;
                        System.out.println("\nIP Address:                " + INT[0].address);
                        System.out.println("\nSubnet Mask:            " + INT[0].subnet);
                        System.out.println("\nBroadcast Address: " + INT[0].broadcast);

                        //sniffer.COUNTER++;
                        */
                  }
      }
}