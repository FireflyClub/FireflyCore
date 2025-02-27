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

public final class ChessRogueReRollDiceCsReqOuterClass {
  /**
   * Protobuf type {@code ChessRogueReRollDiceCsReq}
   */
  public static final class ChessRogueReRollDiceCsReq extends ProtoMessage<ChessRogueReRollDiceCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 OKCOHJJEEAA = 11;</code>
     */
    private int oKCOHJJEEAA;

    private ChessRogueReRollDiceCsReq() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueReRollDiceCsReq}
     */
    public static ChessRogueReRollDiceCsReq newInstance() {
      return new ChessRogueReRollDiceCsReq();
    }

    /**
     * <code>optional uint32 OKCOHJJEEAA = 11;</code>
     * @return whether the oKCOHJJEEAA field is set
     */
    public boolean hasOKCOHJJEEAA() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 OKCOHJJEEAA = 11;</code>
     * @return this
     */
    public ChessRogueReRollDiceCsReq clearOKCOHJJEEAA() {
      bitField0_ &= ~0x00000001;
      oKCOHJJEEAA = 0;
      return this;
    }

    /**
     * <code>optional uint32 OKCOHJJEEAA = 11;</code>
     * @return the oKCOHJJEEAA
     */
    public int getOKCOHJJEEAA() {
      return oKCOHJJEEAA;
    }

    /**
     * <code>optional uint32 OKCOHJJEEAA = 11;</code>
     * @param value the oKCOHJJEEAA to set
     * @return this
     */
    public ChessRogueReRollDiceCsReq setOKCOHJJEEAA(final int value) {
      bitField0_ |= 0x00000001;
      oKCOHJJEEAA = value;
      return this;
    }

    @Override
    public ChessRogueReRollDiceCsReq copyFrom(final ChessRogueReRollDiceCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        oKCOHJJEEAA = other.oKCOHJJEEAA;
      }
      return this;
    }

    @Override
    public ChessRogueReRollDiceCsReq mergeFrom(final ChessRogueReRollDiceCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasOKCOHJJEEAA()) {
        setOKCOHJJEEAA(other.oKCOHJJEEAA);
      }
      return this;
    }

    @Override
    public ChessRogueReRollDiceCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      oKCOHJJEEAA = 0;
      return this;
    }

    @Override
    public ChessRogueReRollDiceCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueReRollDiceCsReq)) {
        return false;
      }
      ChessRogueReRollDiceCsReq other = (ChessRogueReRollDiceCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasOKCOHJJEEAA() || oKCOHJJEEAA == other.oKCOHJJEEAA);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(oKCOHJJEEAA);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(oKCOHJJEEAA);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueReRollDiceCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // oKCOHJJEEAA
            oKCOHJJEEAA = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.oKCOHJJEEAA, oKCOHJJEEAA);
      }
      output.endObject();
    }

    @Override
    public ChessRogueReRollDiceCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1011372032: {
            if (input.isAtField(FieldNames.oKCOHJJEEAA)) {
              if (!input.trySkipNullValue()) {
                oKCOHJJEEAA = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public ChessRogueReRollDiceCsReq clone() {
      return new ChessRogueReRollDiceCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueReRollDiceCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueReRollDiceCsReq(), data).checkInitialized();
    }

    public static ChessRogueReRollDiceCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueReRollDiceCsReq(), input).checkInitialized();
    }

    public static ChessRogueReRollDiceCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueReRollDiceCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueReRollDiceCsReq messages
     */
    public static MessageFactory<ChessRogueReRollDiceCsReq> getFactory() {
      return ChessRogueReRollDiceCsReqFactory.INSTANCE;
    }

    private enum ChessRogueReRollDiceCsReqFactory implements MessageFactory<ChessRogueReRollDiceCsReq> {
      INSTANCE;

      @Override
      public ChessRogueReRollDiceCsReq create() {
        return ChessRogueReRollDiceCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName oKCOHJJEEAA = FieldName.forField("OKCOHJJEEAA");
    }
  }
}
