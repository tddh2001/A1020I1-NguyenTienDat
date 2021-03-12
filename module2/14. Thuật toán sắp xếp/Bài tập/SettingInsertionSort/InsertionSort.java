import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class InsertionSort {
    public void InsertionSort(int[] list){
        for (int i=1; i<list.length; i++){

            int curElement = list[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (curElement < list[j]) {
                    list[j + 1] = list[j];
                } else {
                    break;
                }
            }
            list[j + 1] = curElement;
        }
        System.out.println(Arrays.toString(list));
    }
}
