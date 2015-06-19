package auctionsniper;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SingleMessageListener implements MessageListener {
	private static final TimeUnit SECONDS = null;
	private final ArrayBlockingQueue<Message> messages = new ArrayBlockingQueue<Message>(1);

	public void processMessage(Chat chat, Message message) {
		messages.add(message);
	}

	public void receivesAMessage() throws InterruptedException {
		assertThat("Message", messages.poll(5, SECONDS), is(notNullValue()));
	}
}