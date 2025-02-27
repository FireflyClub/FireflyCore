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
import us.hebi.quickbuf.RepeatedInt;

public final class DelMailCsReqOuterClass {
  /**
   * Protobuf type {@code DelMailCsReq}
   */
  public static final class DelMailCsReq extends ProtoMessage<DelMailCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 id_list = 5;</code>
     */
    private final RepeatedInt idList = RepeatedInt.newEmptyInstance();

    private DelMailCsReq() {
    }

    /**
     * @return a new empty instance of {@code DelMailCsReq}
     */
    public static DelMailCsReq newInstance() {
      return new DelMailCsReq();
    }

    /**
     * <code>repeated uint32 id_list = 5;</code>
     * @return whether the idList field is set
     */
    public boolean hasIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 id_list = 5;</code>
     * @return this
     */
    public DelMailCsReq clearIdList() {
      bitField0_ &= ~0x00000001;
      idList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 id_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getIdList() {
      return idList;
    }

    /**
     * <code>repeated uint32 id_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableIdList() {
      bitField0_ |= 0x00000001;
      return idList;
    }

    /**
     * <code>repeated uint32 id_list = 5;</code>
     * @param value the idList to add
     * @return this
     */
    public DelMailCsReq addIdList(final int value) {
      bitField0_ |= 0x00000001;
      idList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 id_list = 5;</code>
     * @param values the idList to add
     * @return this
     */
    public DelMailCsReq addAllIdList(final int... values) {
      bitField0_ |= 0x00000001;
      idList.addAll(values);
      return this;
    }

    @Override
    public DelMailCsReq copyFrom(final DelMailCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        idList.copyFrom(other.idList);
      }
      return this;
    }

    @Override
    public DelMailCsReq mergeFrom(final DelMailCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIdList()) {
        getMutableIdList().addAll(other.idList);
      }
      return this;
    }

    @Override
    public DelMailCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      idList.clear();
      return this;
    }

    @Override
    public DelMailCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      idList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DelMailCsReq)) {
        return false;
      }
      DelMailCsReq other = (DelMailCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasIdList() || idList.equals(other.idList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < idList.length(); i++) {
          output.writeRawByte((byte) 40);
          output.writeUInt32NoTag(idList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * idList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(idList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DelMailCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 42: {
            // idList [packed=true]
            input.readPackedUInt32(idList, tag);
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
          case 40: {
            // idList [packed=false]
            tag = input.readRepeatedUInt32(idList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.idList, idList);
      }
      output.endObject();
    }

    @Override
    public DelMailCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1194185639:
          case 1652577602: {
            if (input.isAtField(FieldNames.idList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(idList);
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
    public DelMailCsReq clone() {
      return new DelMailCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DelMailCsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DelMailCsReq(), data).checkInitialized();
    }

    public static DelMailCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DelMailCsReq(), input).checkInitialized();
    }

    public static DelMailCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DelMailCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DelMailCsReq messages
     */
    public static MessageFactory<DelMailCsReq> getFactory() {
      return DelMailCsReqFactory.INSTANCE;
    }

    private enum DelMailCsReqFactory implements MessageFactory<DelMailCsReq> {
      INSTANCE;

      @Override
      public DelMailCsReq create() {
        return DelMailCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName idList = FieldName.forField("idList", "id_list");
    }
  }
}
