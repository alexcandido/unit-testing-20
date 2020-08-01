package school.cesar.eta.unit;

public class FakeMessageService extends MessageService{

    @Override
    public boolean send(String msg, String rec) {

        if(msg.equals(rec)){
            return true;
        }
        return false;
    }
}
