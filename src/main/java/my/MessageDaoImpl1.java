package my;

public class MessageDaoImpl1 implements MessageDao {

    @Override
    public Message getById(long id) {
        if (id == 1) {
            Message message = new Message();
            message.setId(1);
            message.setText("Text1");
            return message;
        } else if (id == 2) {
            Message message = new Message();
            message.setId(2);
            message.setText("Text2");
            return message;
        }
        return null;
    }
}
