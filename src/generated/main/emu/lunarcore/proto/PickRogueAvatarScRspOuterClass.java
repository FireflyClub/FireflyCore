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

public final class PickRogueAvatarScRspOuterClass {
  /**
   * Protobuf type {@code PickRogueAvatarScRsp}
   */
  public static final class PickRogueAvatarScRsp extends ProtoMessage<PickRogueAvatarScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     */
    private final RepeatedInt mOICCJNMBBI = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     */
    private final RepeatedInt baseAvatarIdList = RepeatedInt.newEmptyInstance();

    private PickRogueAvatarScRsp() {
    }

    /**
     * @return a new empty instance of {@code PickRogueAvatarScRsp}
     */
    public static PickRogueAvatarScRsp newInstance() {
      return new PickRogueAvatarScRsp();
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
    public PickRogueAvatarScRsp clearRetcode() {
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
    public PickRogueAvatarScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     * @return whether the mOICCJNMBBI field is set
     */
    public boolean hasMOICCJNMBBI() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     * @return this
     */
    public PickRogueAvatarScRsp clearMOICCJNMBBI() {
      bitField0_ &= ~0x00000002;
      mOICCJNMBBI.clear();
      return this;
    }

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMOICCJNMBBI()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMOICCJNMBBI() {
      return mOICCJNMBBI;
    }

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMOICCJNMBBI() {
      bitField0_ |= 0x00000002;
      return mOICCJNMBBI;
    }

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     * @param value the mOICCJNMBBI to add
     * @return this
     */
    public PickRogueAvatarScRsp addMOICCJNMBBI(final int value) {
      bitField0_ |= 0x00000002;
      mOICCJNMBBI.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 MOICCJNMBBI = 2;</code>
     * @param values the mOICCJNMBBI to add
     * @return this
     */
    public PickRogueAvatarScRsp addAllMOICCJNMBBI(final int... values) {
      bitField0_ |= 0x00000002;
      mOICCJNMBBI.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @return whether the baseAvatarIdList field is set
     */
    public boolean hasBaseAvatarIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @return this
     */
    public PickRogueAvatarScRsp clearBaseAvatarIdList() {
      bitField0_ &= ~0x00000004;
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
      bitField0_ |= 0x00000004;
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @param value the baseAvatarIdList to add
     * @return this
     */
    public PickRogueAvatarScRsp addBaseAvatarIdList(final int value) {
      bitField0_ |= 0x00000004;
      baseAvatarIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 4;</code>
     * @param values the baseAvatarIdList to add
     * @return this
     */
    public PickRogueAvatarScRsp addAllBaseAvatarIdList(final int... values) {
      bitField0_ |= 0x00000004;
      baseAvatarIdList.addAll(values);
      return this;
    }

    @Override
    public PickRogueAvatarScRsp copyFrom(final PickRogueAvatarScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        mOICCJNMBBI.copyFrom(other.mOICCJNMBBI);
        baseAvatarIdList.copyFrom(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public PickRogueAvatarScRsp mergeFrom(final PickRogueAvatarScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasMOICCJNMBBI()) {
        getMutableMOICCJNMBBI().addAll(other.mOICCJNMBBI);
      }
      if (other.hasBaseAvatarIdList()) {
        getMutableBaseAvatarIdList().addAll(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public PickRogueAvatarScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      mOICCJNMBBI.clear();
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public PickRogueAvatarScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mOICCJNMBBI.clear();
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PickRogueAvatarScRsp)) {
        return false;
      }
      PickRogueAvatarScRsp other = (PickRogueAvatarScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasMOICCJNMBBI() || mOICCJNMBBI.equals(other.mOICCJNMBBI))
        && (!hasBaseAvatarIdList() || baseAvatarIdList.equals(other.baseAvatarIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < mOICCJNMBBI.length(); i++) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(mOICCJNMBBI.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
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
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * mOICCJNMBBI.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(mOICCJNMBBI);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * baseAvatarIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(baseAvatarIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PickRogueAvatarScRsp mergeFrom(final ProtoSource input) throws IOException {
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
            // mOICCJNMBBI [packed=true]
            input.readPackedUInt32(mOICCJNMBBI, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // baseAvatarIdList [packed=true]
            input.readPackedUInt32(baseAvatarIdList, tag);
            bitField0_ |= 0x00000004;
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
          case 16: {
            // mOICCJNMBBI [packed=false]
            tag = input.readRepeatedUInt32(mOICCJNMBBI, tag);
            bitField0_ |= 0x00000002;
            break;
          }
          case 32: {
            // baseAvatarIdList [packed=false]
            tag = input.readRepeatedUInt32(baseAvatarIdList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeRepeatedUInt32(FieldNames.mOICCJNMBBI, mOICCJNMBBI);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.baseAvatarIdList, baseAvatarIdList);
      }
      output.endObject();
    }

    @Override
    public PickRogueAvatarScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -35824601: {
            if (input.isAtField(FieldNames.mOICCJNMBBI)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(mOICCJNMBBI);
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000004;
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
    public PickRogueAvatarScRsp clone() {
      return new PickRogueAvatarScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PickRogueAvatarScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PickRogueAvatarScRsp(), data).checkInitialized();
    }

    public static PickRogueAvatarScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PickRogueAvatarScRsp(), input).checkInitialized();
    }

    public static PickRogueAvatarScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PickRogueAvatarScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating PickRogueAvatarScRsp messages
     */
    public static MessageFactory<PickRogueAvatarScRsp> getFactory() {
      return PickRogueAvatarScRspFactory.INSTANCE;
    }

    private enum PickRogueAvatarScRspFactory implements MessageFactory<PickRogueAvatarScRsp> {
      INSTANCE;

      @Override
      public PickRogueAvatarScRsp create() {
        return PickRogueAvatarScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName mOICCJNMBBI = FieldName.forField("MOICCJNMBBI");

      static final FieldName baseAvatarIdList = FieldName.forField("baseAvatarIdList", "base_avatar_id_list");
    }
  }
}
