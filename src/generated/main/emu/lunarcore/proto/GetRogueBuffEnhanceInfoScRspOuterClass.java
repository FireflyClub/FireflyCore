// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class GetRogueBuffEnhanceInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetRogueBuffEnhanceInfoScRsp}
   */
  public static final class GetRogueBuffEnhanceInfoScRsp extends ProtoMessage<GetRogueBuffEnhanceInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueBuffEnhanceShopInfo shop_info = 14;</code>
     */
    private final RogueBuffEnhanceShopInfoOuterClass.RogueBuffEnhanceShopInfo shopInfo = RogueBuffEnhanceShopInfoOuterClass.RogueBuffEnhanceShopInfo.newInstance();

    private GetRogueBuffEnhanceInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetRogueBuffEnhanceInfoScRsp}
     */
    public static GetRogueBuffEnhanceInfoScRsp newInstance() {
      return new GetRogueBuffEnhanceInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public GetRogueBuffEnhanceInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetRogueBuffEnhanceInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueBuffEnhanceShopInfo shop_info = 14;</code>
     * @return whether the shopInfo field is set
     */
    public boolean hasShopInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueBuffEnhanceShopInfo shop_info = 14;</code>
     * @return this
     */
    public GetRogueBuffEnhanceInfoScRsp clearShopInfo() {
      bitField0_ &= ~0x00000002;
      shopInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuffEnhanceShopInfo shop_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableShopInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffEnhanceShopInfoOuterClass.RogueBuffEnhanceShopInfo getShopInfo() {
      return shopInfo;
    }

    /**
     * <code>optional .RogueBuffEnhanceShopInfo shop_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffEnhanceShopInfoOuterClass.RogueBuffEnhanceShopInfo getMutableShopInfo() {
      bitField0_ |= 0x00000002;
      return shopInfo;
    }

    /**
     * <code>optional .RogueBuffEnhanceShopInfo shop_info = 14;</code>
     * @param value the shopInfo to set
     * @return this
     */
    public GetRogueBuffEnhanceInfoScRsp setShopInfo(
        final RogueBuffEnhanceShopInfoOuterClass.RogueBuffEnhanceShopInfo value) {
      bitField0_ |= 0x00000002;
      shopInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetRogueBuffEnhanceInfoScRsp copyFrom(final GetRogueBuffEnhanceInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        shopInfo.copyFrom(other.shopInfo);
      }
      return this;
    }

    @Override
    public GetRogueBuffEnhanceInfoScRsp mergeFrom(final GetRogueBuffEnhanceInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasShopInfo()) {
        getMutableShopInfo().mergeFrom(other.shopInfo);
      }
      return this;
    }

    @Override
    public GetRogueBuffEnhanceInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      shopInfo.clear();
      return this;
    }

    @Override
    public GetRogueBuffEnhanceInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      shopInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetRogueBuffEnhanceInfoScRsp)) {
        return false;
      }
      GetRogueBuffEnhanceInfoScRsp other = (GetRogueBuffEnhanceInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasShopInfo() || shopInfo.equals(other.shopInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(shopInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(shopInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetRogueBuffEnhanceInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // shopInfo
            input.readMessage(shopInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.shopInfo, shopInfo);
      }
      output.endObject();
    }

    @Override
    public GetRogueBuffEnhanceInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -345618236:
          case -2104054697: {
            if (input.isAtField(FieldNames.shopInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(shopInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetRogueBuffEnhanceInfoScRsp clone() {
      return new GetRogueBuffEnhanceInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetRogueBuffEnhanceInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetRogueBuffEnhanceInfoScRsp(), data).checkInitialized();
    }

    public static GetRogueBuffEnhanceInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetRogueBuffEnhanceInfoScRsp(), input).checkInitialized();
    }

    public static GetRogueBuffEnhanceInfoScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetRogueBuffEnhanceInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetRogueBuffEnhanceInfoScRsp messages
     */
    public static MessageFactory<GetRogueBuffEnhanceInfoScRsp> getFactory() {
      return GetRogueBuffEnhanceInfoScRspFactory.INSTANCE;
    }

    private enum GetRogueBuffEnhanceInfoScRspFactory implements MessageFactory<GetRogueBuffEnhanceInfoScRsp> {
      INSTANCE;

      @Override
      public GetRogueBuffEnhanceInfoScRsp create() {
        return GetRogueBuffEnhanceInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName shopInfo = FieldName.forField("shopInfo", "shop_info");
    }
  }
}
