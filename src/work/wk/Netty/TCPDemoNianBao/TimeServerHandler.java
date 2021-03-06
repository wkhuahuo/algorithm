package work.wk.Netty.TCPDemoNianBao;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by wangkai43 on 2017/7/14.
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter{
    private int counter;


    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception{
        ByteBuf buf = (ByteBuf) msg;
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req,"UTF-8").substring(0,req.length-System.getProperty("line.separator").length());
        System.out.println("The time server receive order :"+body+
                "; the counter is: "+ ++counter);
        String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body)? new java.util.Date(
                System.currentTimeMillis()).toString() : "BAD ORDER";
        currentTime = currentTime + System.getProperty("line.separator");
        ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
        ctx.writeAndFlush(resp);

    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
        ctx.close();
    }


}
