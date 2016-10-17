package my;

public class MessageDaoImpl2 implements MessageDao {

    @Override
    public Message getById(long id) {
        if (id == 1) {
            Message message = new Message();
            message.setId(1);
            message.setText("Text Hello");
            return message;
        }
        return null;
    }
}
