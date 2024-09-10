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

public final class RestoreWolfBroGameArchiveCsReqOuterClass {
  /**
   * Protobuf type {@code RestoreWolfBroGameArchiveCsReq}
   */
  public static final class RestoreWolfBroGameArchiveCsReq extends ProtoMessage<RestoreWolfBroGameArchiveCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 10;</code>
     */
    private int id;

    private RestoreWolfBroGameArchiveCsReq() {
    }

    /**
     * @return a new empty instance of {@code RestoreWolfBroGameArchiveCsReq}
     */
    public static RestoreWolfBroGameArchiveCsReq newInstance() {
      return new RestoreWolfBroGameArchiveCsReq();
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @param value the id to set
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq copyFrom(final RestoreWolfBroGameArchiveCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
      }
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq mergeFrom(final RestoreWolfBroGameArchiveCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq clearQuick() {
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
      if (!(o instanceof RestoreWolfBroGameArchiveCsReq)) {
        return false;
      }
      RestoreWolfBroGameArchiveCsReq other = (RestoreWolfBroGameArchiveCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(id);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RestoreWolfBroGameArchiveCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // id
            id = input.readUInt32();
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
        output.writeUInt32(FieldNames.id, id);
      }
      output.endObject();
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
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
    public RestoreWolfBroGameArchiveCsReq clone() {
      return new RestoreWolfBroGameArchiveCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RestoreWolfBroGameArchiveCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RestoreWolfBroGameArchiveCsReq(), data).checkInitialized();
    }

    public static RestoreWolfBroGameArchiveCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RestoreWolfBroGameArchiveCsReq(), input).checkInitialized();
    }

    public static RestoreWolfBroGameArchiveCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RestoreWolfBroGameArchiveCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating RestoreWolfBroGameArchiveCsReq messages
     */
    public static MessageFactory<RestoreWolfBroGameArchiveCsReq> getFactory() {
      return RestoreWolfBroGameArchiveCsReqFactory.INSTANCE;
    }

    private enum RestoreWolfBroGameArchiveCsReqFactory implements MessageFactory<RestoreWolfBroGameArchiveCsReq> {
      INSTANCE;

      @Override
      public RestoreWolfBroGameArchiveCsReq create() {
        return RestoreWolfBroGameArchiveCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");
    }
  }
}
