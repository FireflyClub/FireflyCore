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

public final class GetAvatarDataCsReqOuterClass {
  /**
   * Protobuf type {@code GetAvatarDataCsReq}
   */
  public static final class GetAvatarDataCsReq extends ProtoMessage<GetAvatarDataCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional bool if_is_get_all = 8;</code>
     */
    private boolean ifIsGetAll;

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     */
    private final RepeatedInt baseAvatarIdList = RepeatedInt.newEmptyInstance();

    private GetAvatarDataCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetAvatarDataCsReq}
     */
    public static GetAvatarDataCsReq newInstance() {
      return new GetAvatarDataCsReq();
    }

    /**
     * <code>optional bool if_is_get_all = 8;</code>
     * @return whether the ifIsGetAll field is set
     */
    public boolean hasIfIsGetAll() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional bool if_is_get_all = 8;</code>
     * @return this
     */
    public GetAvatarDataCsReq clearIfIsGetAll() {
      bitField0_ &= ~0x00000001;
      ifIsGetAll = false;
      return this;
    }

    /**
     * <code>optional bool if_is_get_all = 8;</code>
     * @return the ifIsGetAll
     */
    public boolean getIfIsGetAll() {
      return ifIsGetAll;
    }

    /**
     * <code>optional bool if_is_get_all = 8;</code>
     * @param value the ifIsGetAll to set
     * @return this
     */
    public GetAvatarDataCsReq setIfIsGetAll(final boolean value) {
      bitField0_ |= 0x00000001;
      ifIsGetAll = value;
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @return whether the baseAvatarIdList field is set
     */
    public boolean hasBaseAvatarIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @return this
     */
    public GetAvatarDataCsReq clearBaseAvatarIdList() {
      bitField0_ &= ~0x00000002;
      baseAvatarIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBaseAvatarIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBaseAvatarIdList() {
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBaseAvatarIdList() {
      bitField0_ |= 0x00000002;
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @param value the baseAvatarIdList to add
     * @return this
     */
    public GetAvatarDataCsReq addBaseAvatarIdList(final int value) {
      bitField0_ |= 0x00000002;
      baseAvatarIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @param values the baseAvatarIdList to add
     * @return this
     */
    public GetAvatarDataCsReq addAllBaseAvatarIdList(final int... values) {
      bitField0_ |= 0x00000002;
      baseAvatarIdList.addAll(values);
      return this;
    }

    @Override
    public GetAvatarDataCsReq copyFrom(final GetAvatarDataCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        ifIsGetAll = other.ifIsGetAll;
        baseAvatarIdList.copyFrom(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public GetAvatarDataCsReq mergeFrom(final GetAvatarDataCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIfIsGetAll()) {
        setIfIsGetAll(other.ifIsGetAll);
      }
      if (other.hasBaseAvatarIdList()) {
        getMutableBaseAvatarIdList().addAll(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public GetAvatarDataCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      ifIsGetAll = false;
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public GetAvatarDataCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetAvatarDataCsReq)) {
        return false;
      }
      GetAvatarDataCsReq other = (GetAvatarDataCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasIfIsGetAll() || ifIsGetAll == other.ifIsGetAll)
        && (!hasBaseAvatarIdList() || baseAvatarIdList.equals(other.baseAvatarIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeBoolNoTag(ifIsGetAll);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < baseAvatarIdList.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(baseAvatarIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * baseAvatarIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(baseAvatarIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetAvatarDataCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // ifIsGetAll
            ifIsGetAll = input.readBool();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // baseAvatarIdList [packed=true]
            input.readPackedUInt32(baseAvatarIdList, tag);
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
          case 32: {
            // baseAvatarIdList [packed=false]
            tag = input.readRepeatedUInt32(baseAvatarIdList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeBool(FieldNames.ifIsGetAll, ifIsGetAll);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.baseAvatarIdList, baseAvatarIdList);
      }
      output.endObject();
    }

    @Override
    public GetAvatarDataCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 653467762:
          case 2052811653: {
            if (input.isAtField(FieldNames.ifIsGetAll)) {
              if (!input.trySkipNullValue()) {
                ifIsGetAll = input.readBool();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1212654461:
          case 914628490: {
            if (input.isAtField(FieldNames.baseAvatarIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(baseAvatarIdList);
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
    public GetAvatarDataCsReq clone() {
      return new GetAvatarDataCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetAvatarDataCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetAvatarDataCsReq(), data).checkInitialized();
    }

    public static GetAvatarDataCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetAvatarDataCsReq(), input).checkInitialized();
    }

    public static GetAvatarDataCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetAvatarDataCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetAvatarDataCsReq messages
     */
    public static MessageFactory<GetAvatarDataCsReq> getFactory() {
      return GetAvatarDataCsReqFactory.INSTANCE;
    }

    private enum GetAvatarDataCsReqFactory implements MessageFactory<GetAvatarDataCsReq> {
      INSTANCE;

      @Override
      public GetAvatarDataCsReq create() {
        return GetAvatarDataCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName ifIsGetAll = FieldName.forField("ifIsGetAll", "if_is_get_all");

      static final FieldName baseAvatarIdList = FieldName.forField("baseAvatarIdList", "base_avatar_id_list");
    }
  }
}
