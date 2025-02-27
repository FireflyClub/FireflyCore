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

public final class MarkReadMailScRspOuterClass {
  /**
   * Protobuf type {@code MarkReadMailScRsp}
   */
  public static final class MarkReadMailScRsp extends ProtoMessage<MarkReadMailScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 id = 5;</code>
     */
    private int id;

    private MarkReadMailScRsp() {
    }

    /**
     * @return a new empty instance of {@code MarkReadMailScRsp}
     */
    public static MarkReadMailScRsp newInstance() {
      return new MarkReadMailScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public MarkReadMailScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public MarkReadMailScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @return this
     */
    public MarkReadMailScRsp clearId() {
      bitField0_ &= ~0x00000002;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @param value the id to set
     * @return this
     */
    public MarkReadMailScRsp setId(final int value) {
      bitField0_ |= 0x00000002;
      id = value;
      return this;
    }

    @Override
    public MarkReadMailScRsp copyFrom(final MarkReadMailScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        id = other.id;
      }
      return this;
    }

    @Override
    public MarkReadMailScRsp mergeFrom(final MarkReadMailScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      return this;
    }

    @Override
    public MarkReadMailScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      id = 0;
      return this;
    }

    @Override
    public MarkReadMailScRsp clearQuick() {
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
      if (!(o instanceof MarkReadMailScRsp)) {
        return false;
      }
      MarkReadMailScRsp other = (MarkReadMailScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasId() || id == other.id);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(id);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MarkReadMailScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // id
            id = input.readUInt32();
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
        output.writeUInt32(FieldNames.id, id);
      }
      output.endObject();
    }

    @Override
    public MarkReadMailScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
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
    public MarkReadMailScRsp clone() {
      return new MarkReadMailScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MarkReadMailScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MarkReadMailScRsp(), data).checkInitialized();
    }

    public static MarkReadMailScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MarkReadMailScRsp(), input).checkInitialized();
    }

    public static MarkReadMailScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MarkReadMailScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating MarkReadMailScRsp messages
     */
    public static MessageFactory<MarkReadMailScRsp> getFactory() {
      return MarkReadMailScRspFactory.INSTANCE;
    }

    private enum MarkReadMailScRspFactory implements MessageFactory<MarkReadMailScRsp> {
      INSTANCE;

      @Override
      public MarkReadMailScRsp create() {
        return MarkReadMailScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName id = FieldName.forField("id");
    }
  }
}
