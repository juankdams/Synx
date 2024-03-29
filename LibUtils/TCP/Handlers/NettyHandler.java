package Handlers;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundByteHandlerAdapter;
import io.netty.util.AttributeKey;

import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class NettyHandler extends ChannelInboundByteHandlerAdapter {//implements Handler {

    private static final Logger logger = Logger.getLogger(NettyHandler.class.getName());

    @Override
    public void inboundBufferUpdated(ChannelHandlerContext ctx, ByteBuf in) {
        ByteBuf out = ctx.nextOutboundByteBuffer();
        out.writeBytes(in);
        System.out.println("out  = "+out.toString());
        ctx.flush();
    }


   // @Override
   // public void messageReceived(ChannelHandlerContext ctx, MessageList<Object> msgs) throws Exception {
    //    ctx.write(msgs);
   // }
    
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // Close the connection when an exception is raised.
        logger.log(Level.WARNING, "Unexpected exception from downstream.", cause);
        ctx.close();
    }

	
	public NettyHandler() {
		super();
	}

	/*
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		ctx.channel().attr(CLIENTSESS_ATTR).setIfAbsent(new ClientSession(ctx.channel()));
		logger.info("A new channel is active: " + ctx.channel());
	}
	
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		ClientSession sess = ctx.channel().attr(CLIENTSESS_ATTR).get();
		logger.info("Channel inactive: " + sess);
		//TODO: deregister from list
 	}
	
	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
	}
	
	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, ByteBuf packet) throws Exception {
	
	}
    */
    
    
}


