//original Java json.simple library
//import org.json.simple.JSONObject;
//My modificated Java json.simple library for order the fields


import org.json.simple.JSONObject;

/****************************************************
 *  Author: Alejandro Alexiades                     *
 *                                                  *
 *  Example of the modificated Json.Simple Libary   *
 *  for order the fields of the Json that comes     *
 *  from an array, in this case.                     *
 *                                                  *
 ***************************************************/

public class main {

    public static void main( String[] arg ){

        String[] header={"Name","Surname","Country","State","City", "Address","PostalCode"};
        String[] content={"Alex","Alexiades","Tazmania","Taz","DiabloCity", "Crazy Avenue","9999"};


        //Test Json library
        System.out.println(Order(header,content));
    }


    public static JSONObject Order(String[] hdr,String[] cnt){
        
        JSONObject exOrd= new JSONObject();

        for (int index=0;index<hdr.length;index++){

            final Object put = exOrd.put(hdr[index], cnt[index]);

        }

        return exOrd;
    }

}
