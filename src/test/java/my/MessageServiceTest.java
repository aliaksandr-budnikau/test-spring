package my;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


public class MessageServiceTest {

    private MessageService service;

    @Before
    public void setUp () {
        MessageDaoImpl1 mock = Mockito.mock(MessageDaoImpl1.class);

        Message message = new Message();
        message.setId(1);
        message.setText("Text1");

        when(mock.getById(1)).thenReturn(message);
        when(mock.getById(3)).thenReturn(null);
        service = new MessageService(mock);
    }

    @Test
    public void testGetById() throws Exception {
        long id = 1;
        Message message = service.getById(id);
        Assert.assertEquals(id, message.getId());
        Assert.assertEquals("Text1", message.getText());
    }

    @Test
    public void testGetByIdReturnNull() throws Exception {
        long id = 3;
        Message message = service.getById(id);
        Assert.assertNull(message);
    }
}