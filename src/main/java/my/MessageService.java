package my;

public class MessageService {

    private final MessageDao messageDao;

    public MessageService(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public Message getById(long id) {
        return messageDao.getById(id);
    }
}
