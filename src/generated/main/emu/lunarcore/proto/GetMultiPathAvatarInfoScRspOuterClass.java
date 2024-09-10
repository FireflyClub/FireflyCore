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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetMultiPathAvatarInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetMultiPathAvatarInfoScRsp}
   */
  public static final class GetMultiPathAvatarInfoScRsp extends ProtoMessage<GetMultiPathAvatarInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     */
    private final RepeatedInt multiAvatarTypeIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     */
    private final RepeatedMessage<CurrentMultiAvatarIdEntry> currentMultiAvatarId = RepeatedMessage.newEmptyInstance(CurrentMultiAvatarIdEntry.getFactory());

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     */
    private final RepeatedMessage<MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo> multiPathAvatarInfoList = RepeatedMessage.newEmptyInstance(MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo.getFactory());

    private GetMultiPathAvatarInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetMultiPathAvatarInfoScRsp}
     */
    public static GetMultiPathAvatarInfoScRsp newInstance() {
      return new GetMultiPathAvatarInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     * @return whether the multiAvatarTypeIdList field is set
     */
    public boolean hasMultiAvatarTypeIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearMultiAvatarTypeIdList() {
      bitField0_ &= ~0x00000002;
      multiAvatarTypeIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMultiAvatarTypeIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMultiAvatarTypeIdList() {
      return multiAvatarTypeIdList;
    }

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMultiAvatarTypeIdList() {
      bitField0_ |= 0x00000002;
      return multiAvatarTypeIdList;
    }

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     * @param value the multiAvatarTypeIdList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addMultiAvatarTypeIdList(final int value) {
      bitField0_ |= 0x00000002;
      multiAvatarTypeIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 multi_avatar_type_id_list = 2;</code>
     * @param values the multiAvatarTypeIdList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllMultiAvatarTypeIdList(final int... values) {
      bitField0_ |= 0x00000002;
      multiAvatarTypeIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     * @return whether the currentMultiAvatarId field is set
     */
    public boolean hasCurrentMultiAvatarId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearCurrentMultiAvatarId() {
      bitField0_ &= ~0x00000004;
      currentMultiAvatarId.clear();
      return this;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurrentMultiAvatarId()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<CurrentMultiAvatarIdEntry> getCurrentMultiAvatarId() {
      return currentMultiAvatarId;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<CurrentMultiAvatarIdEntry> getMutableCurrentMultiAvatarId() {
      bitField0_ |= 0x00000004;
      return currentMultiAvatarId;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     * @param value the currentMultiAvatarId to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addCurrentMultiAvatarId(
        final CurrentMultiAvatarIdEntry value) {
      bitField0_ |= 0x00000004;
      currentMultiAvatarId.add(value);
      return this;
    }

    /**
     * <code>repeated .GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry current_multi_avatar_id = 5;</code>
     * @param values the currentMultiAvatarId to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllCurrentMultiAvatarId(
        final CurrentMultiAvatarIdEntry... values) {
      bitField0_ |= 0x00000004;
      currentMultiAvatarId.addAll(values);
      return this;
    }

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     * @return whether the multiPathAvatarInfoList field is set
     */
    public boolean hasMultiPathAvatarInfoList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearMultiPathAvatarInfoList() {
      bitField0_ &= ~0x00000008;
      multiPathAvatarInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMultiPathAvatarInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo> getMultiPathAvatarInfoList(
        ) {
      return multiPathAvatarInfoList;
    }

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo> getMutableMultiPathAvatarInfoList(
        ) {
      bitField0_ |= 0x00000008;
      return multiPathAvatarInfoList;
    }

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     * @param value the multiPathAvatarInfoList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addMultiPathAvatarInfoList(
        final MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo value) {
      bitField0_ |= 0x00000008;
      multiPathAvatarInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .MultiPathAvatarTypeInfo multi_path_avatar_info_list = 7;</code>
     * @param values the multiPathAvatarInfoList to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllMultiPathAvatarInfoList(
        final MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo... values) {
      bitField0_ |= 0x00000008;
      multiPathAvatarInfoList.addAll(values);
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp copyFrom(final GetMultiPathAvatarInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        multiAvatarTypeIdList.copyFrom(other.multiAvatarTypeIdList);
        currentMultiAvatarId.copyFrom(other.currentMultiAvatarId);
        multiPathAvatarInfoList.copyFrom(other.multiPathAvatarInfoList);
      }
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp mergeFrom(final GetMultiPathAvatarInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasMultiAvatarTypeIdList()) {
        getMutableMultiAvatarTypeIdList().addAll(other.multiAvatarTypeIdList);
      }
      if (other.hasCurrentMultiAvatarId()) {
        getMutableCurrentMultiAvatarId().addAll(other.currentMultiAvatarId);
      }
      if (other.hasMultiPathAvatarInfoList()) {
        getMutableMultiPathAvatarInfoList().addAll(other.multiPathAvatarInfoList);
      }
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      multiAvatarTypeIdList.clear();
      currentMultiAvatarId.clear();
      multiPathAvatarInfoList.clear();
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      multiAvatarTypeIdList.clear();
      currentMultiAvatarId.clearQuick();
      multiPathAvatarInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMultiPathAvatarInfoScRsp)) {
        return false;
      }
      GetMultiPathAvatarInfoScRsp other = (GetMultiPathAvatarInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasMultiAvatarTypeIdList() || multiAvatarTypeIdList.equals(other.multiAvatarTypeIdList))
        && (!hasCurrentMultiAvatarId() || currentMultiAvatarId.equals(other.currentMultiAvatarId))
        && (!hasMultiPathAvatarInfoList() || multiPathAvatarInfoList.equals(other.multiPathAvatarInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < multiAvatarTypeIdList.length(); i++) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(multiAvatarTypeIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < currentMultiAvatarId.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(currentMultiAvatarId.get(i));
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < multiPathAvatarInfoList.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(multiPathAvatarInfoList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * multiAvatarTypeIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(multiAvatarTypeIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * currentMultiAvatarId.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(currentMultiAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * multiPathAvatarInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(multiPathAvatarInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMultiPathAvatarInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // multiAvatarTypeIdList [packed=true]
            input.readPackedUInt32(multiAvatarTypeIdList, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // currentMultiAvatarId
            tag = input.readRepeatedMessage(currentMultiAvatarId, tag);
            bitField0_ |= 0x00000004;
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // multiPathAvatarInfoList
            tag = input.readRepeatedMessage(multiPathAvatarInfoList, tag);
            bitField0_ |= 0x00000008;
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
          case 16: {
            // multiAvatarTypeIdList [packed=false]
            tag = input.readRepeatedUInt32(multiAvatarTypeIdList, tag);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.multiAvatarTypeIdList, multiAvatarTypeIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.currentMultiAvatarId, currentMultiAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.multiPathAvatarInfoList, multiPathAvatarInfoList);
      }
      output.endObject();
    }

    @Override
    public GetMultiPathAvatarInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -948118075:
          case 1948884573: {
            if (input.isAtField(FieldNames.multiAvatarTypeIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(multiAvatarTypeIdList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -63723596:
          case 59630453: {
            if (input.isAtField(FieldNames.currentMultiAvatarId)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(currentMultiAvatarId);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1198530685:
          case -2042493827: {
            if (input.isAtField(FieldNames.multiPathAvatarInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(multiPathAvatarInfoList);
                bitField0_ |= 0x00000008;
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
    public GetMultiPathAvatarInfoScRsp clone() {
      return new GetMultiPathAvatarInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), data).checkInitialized();
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), input).checkInitialized();
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMultiPathAvatarInfoScRsp messages
     */
    public static MessageFactory<GetMultiPathAvatarInfoScRsp> getFactory() {
      return GetMultiPathAvatarInfoScRspFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code CurrentMultiAvatarIdEntry}
     */
    public static final class CurrentMultiAvatarIdEntry extends ProtoMessage<CurrentMultiAvatarIdEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       */
      private int value_;

      private CurrentMultiAvatarIdEntry() {
      }

      /**
       * @return a new empty instance of {@code CurrentMultiAvatarIdEntry}
       */
      public static CurrentMultiAvatarIdEntry newInstance() {
        return new CurrentMultiAvatarIdEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public CurrentMultiAvatarIdEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public CurrentMultiAvatarIdEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return this
       */
      public CurrentMultiAvatarIdEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return the value_
       */
      public MultiPathAvatarTypeOuterClass.MultiPathAvatarType getValue() {
        return MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value_);
      }

      /**
       * Gets the value of the internal enum store. The result is
       * equivalent to {@link CurrentMultiAvatarIdEntry#getValue()}.getNumber().
       *
       * @return numeric wire representation
       */
      public int getValueValue() {
        return value_;
      }

      /**
       * Sets the value of the internal enum store. This does not
       * do any validity checks, so be sure to use appropriate value
       * constants from {@link MultiPathAvatarTypeOuterClass.MultiPathAvatarType}. Setting an invalid value
       * can cause {@link CurrentMultiAvatarIdEntry#getValue()} to return null
       *
       * @param value the numeric wire value to set
       * @return this
       */
      public CurrentMultiAvatarIdEntry setValueValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public CurrentMultiAvatarIdEntry setValue(
          final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value) {
        bitField0_ |= 0x00000002;
        value_ = value.getNumber();
        return this;
      }

      @Override
      public CurrentMultiAvatarIdEntry copyFrom(final CurrentMultiAvatarIdEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public CurrentMultiAvatarIdEntry mergeFrom(final CurrentMultiAvatarIdEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValueValue(other.value_);
        }
        return this;
      }

      @Override
      public CurrentMultiAvatarIdEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public CurrentMultiAvatarIdEntry clearQuick() {
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
        if (!(o instanceof CurrentMultiAvatarIdEntry)) {
          return false;
        }
        CurrentMultiAvatarIdEntry other = (CurrentMultiAvatarIdEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeEnumNoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeEnumSizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public CurrentMultiAvatarIdEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              final int value = input.readInt32();
              if (MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value) != null) {
                value_ = value;
                bitField0_ |= 0x00000002;
              }
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
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeEnum(FieldNames.value_, value_, MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
        }
        output.endObject();
      }

      @Override
      public CurrentMultiAvatarIdEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value = input.readEnum(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
                  if (value != null) {
                    value_ = value.getNumber();
                    bitField0_ |= 0x00000002;
                  } else {
                    input.skipUnknownEnumValue();
                  }
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
      public CurrentMultiAvatarIdEntry clone() {
        return new CurrentMultiAvatarIdEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static CurrentMultiAvatarIdEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new CurrentMultiAvatarIdEntry(), data).checkInitialized();
      }

      public static CurrentMultiAvatarIdEntry parseFrom(final ProtoSource input) throws
          IOException {
        return ProtoMessage.mergeFrom(new CurrentMultiAvatarIdEntry(), input).checkInitialized();
      }

      public static CurrentMultiAvatarIdEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new CurrentMultiAvatarIdEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating CurrentMultiAvatarIdEntry messages
       */
      public static MessageFactory<CurrentMultiAvatarIdEntry> getFactory() {
        return CurrentMultiAvatarIdEntryFactory.INSTANCE;
      }

      private enum CurrentMultiAvatarIdEntryFactory implements MessageFactory<CurrentMultiAvatarIdEntry> {
        INSTANCE;

        @Override
        public CurrentMultiAvatarIdEntry create() {
          return CurrentMultiAvatarIdEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum GetMultiPathAvatarInfoScRspFactory implements MessageFactory<GetMultiPathAvatarInfoScRsp> {
      INSTANCE;

      @Override
      public GetMultiPathAvatarInfoScRsp create() {
        return GetMultiPathAvatarInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName multiAvatarTypeIdList = FieldName.forField("multiAvatarTypeIdList", "multi_avatar_type_id_list");

      static final FieldName currentMultiAvatarId = FieldName.forField("currentMultiAvatarId", "current_multi_avatar_id");

      static final FieldName multiPathAvatarInfoList = FieldName.forField("multiPathAvatarInfoList", "multi_path_avatar_info_list");
    }
  }
}
