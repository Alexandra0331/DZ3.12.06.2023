package base.classes.checkinputData;

import base.abstractClasses.ACheckQuantity;
import base.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}
