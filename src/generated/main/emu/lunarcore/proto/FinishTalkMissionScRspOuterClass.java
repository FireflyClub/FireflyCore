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
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class FinishTalkMissionScRspOuterClass {
  /**
   * Protobuf type {@code FinishTalkMissionScRsp}
   */
  public static final class FinishTalkMissionScRsp extends ProtoMessage<FinishTalkMissionScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 sub_mission_id = 10;</code>
     */
    private int subMissionId;

    /**
     * <code>optional string talk_str = 6;</code>
     */
    private final Utf8String talkStr = Utf8String.newEmptyInstance();

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     */
    private final RepeatedMessage<MissionCustomValueDataOuterClass.MissionCustomValueData> customValueList = RepeatedMessage.newEmptyInstance(MissionCustomValueDataOuterClass.MissionCustomValueData.getFactory());

    private FinishTalkMissionScRsp() {
    }

    /**
     * @return a new empty instance of {@code FinishTalkMissionScRsp}
     */
    public static FinishTalkMissionScRsp newInstance() {
      return new FinishTalkMissionScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public FinishTalkMissionScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public FinishTalkMissionScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 sub_mission_id = 10;</code>
     * @return whether the subMissionId field is set
     */
    public boolean hasSubMissionId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 sub_mission_id = 10;</code>
     * @return this
     */
    public FinishTalkMissionScRsp clearSubMissionId() {
      bitField0_ &= ~0x00000002;
      subMissionId = 0;
      return this;
    }

    /**
     * <code>optional uint32 sub_mission_id = 10;</code>
     * @return the subMissionId
     */
    public int getSubMissionId() {
      return subMissionId;
    }

    /**
     * <code>optional uint32 sub_mission_id = 10;</code>
     * @param value the subMissionId to set
     * @return this
     */
    public FinishTalkMissionScRsp setSubMissionId(final int value) {
      bitField0_ |= 0x00000002;
      subMissionId = value;
      return this;
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @return whether the talkStr field is set
     */
    public boolean hasTalkStr() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @return this
     */
    public FinishTalkMissionScRsp clearTalkStr() {
      bitField0_ &= ~0x00000004;
      talkStr.clear();
      return this;
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @return the talkStr
     */
    public String getTalkStr() {
      return talkStr.getString();
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @return internal {@code Utf8String} representation of talkStr for reading
     */
    public Utf8String getTalkStrBytes() {
      return this.talkStr;
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @return internal {@code Utf8String} representation of talkStr for modifications
     */
    public Utf8String getMutableTalkStrBytes() {
      bitField0_ |= 0x00000004;
      return this.talkStr;
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @param value the talkStr to set
     * @return this
     */
    public FinishTalkMissionScRsp setTalkStr(final CharSequence value) {
      bitField0_ |= 0x00000004;
      talkStr.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string talk_str = 6;</code>
     * @param value the talkStr to set
     * @return this
     */
    public FinishTalkMissionScRsp setTalkStr(final Utf8String value) {
      bitField0_ |= 0x00000004;
      talkStr.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     * @return whether the customValueList field is set
     */
    public boolean hasCustomValueList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     * @return this
     */
    public FinishTalkMissionScRsp clearCustomValueList() {
      bitField0_ &= ~0x00000008;
      customValueList.clear();
      return this;
    }

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCustomValueList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MissionCustomValueDataOuterClass.MissionCustomValueData> getCustomValueList(
        ) {
      return customValueList;
    }

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MissionCustomValueDataOuterClass.MissionCustomValueData> getMutableCustomValueList(
        ) {
      bitField0_ |= 0x00000008;
      return customValueList;
    }

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     * @param value the customValueList to add
     * @return this
     */
    public FinishTalkMissionScRsp addCustomValueList(
        final MissionCustomValueDataOuterClass.MissionCustomValueData value) {
      bitField0_ |= 0x00000008;
      customValueList.add(value);
      return this;
    }

    /**
     * <code>repeated .MissionCustomValueData custom_value_list = 3;</code>
     * @param values the customValueList to add
     * @return this
     */
    public FinishTalkMissionScRsp addAllCustomValueList(
        final MissionCustomValueDataOuterClass.MissionCustomValueData... values) {
      bitField0_ |= 0x00000008;
      customValueList.addAll(values);
      return this;
    }

    @Override
    public FinishTalkMissionScRsp copyFrom(final FinishTalkMissionScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        subMissionId = other.subMissionId;
        talkStr.copyFrom(other.talkStr);
        customValueList.copyFrom(other.customValueList);
      }
      return this;
    }

    @Override
    public FinishTalkMissionScRsp mergeFrom(final FinishTalkMissionScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasSubMissionId()) {
        setSubMissionId(other.subMissionId);
      }
      if (other.hasTalkStr()) {
        getMutableTalkStrBytes().copyFrom(other.talkStr);
      }
      if (other.hasCustomValueList()) {
        getMutableCustomValueList().addAll(other.customValueList);
      }
      return this;
    }

    @Override
    public FinishTalkMissionScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      subMissionId = 0;
      talkStr.clear();
      customValueList.clear();
      return this;
    }

    @Override
    public FinishTalkMissionScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talkStr.clear();
      customValueList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof FinishTalkMissionScRsp)) {
        return false;
      }
      FinishTalkMissionScRsp other = (FinishTalkMissionScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasSubMissionId() || subMissionId == other.subMissionId)
        && (!hasTalkStr() || talkStr.equals(other.talkStr))
        && (!hasCustomValueList() || customValueList.equals(other.customValueList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(subMissionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(talkStr);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < customValueList.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(customValueList.get(i));
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
        size += 1 + ProtoSink.computeUInt32SizeNoTag(subMissionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(talkStr);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * customValueList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(customValueList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FinishTalkMissionScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // subMissionId
            subMissionId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // talkStr
            input.readString(talkStr);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // customValueList
            tag = input.readRepeatedMessage(customValueList, tag);
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
        output.writeUInt32(FieldNames.subMissionId, subMissionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeString(FieldNames.talkStr, talkStr);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.customValueList, customValueList);
      }
      output.endObject();
    }

    @Override
    public FinishTalkMissionScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -955858585:
          case -1513479155: {
            if (input.isAtField(FieldNames.subMissionId)) {
              if (!input.trySkipNullValue()) {
                subMissionId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1543716379:
          case -610210786: {
            if (input.isAtField(FieldNames.talkStr)) {
              if (!input.trySkipNullValue()) {
                input.readString(talkStr);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2009823550:
          case 1803812922: {
            if (input.isAtField(FieldNames.customValueList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(customValueList);
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
    public FinishTalkMissionScRsp clone() {
      return new FinishTalkMissionScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FinishTalkMissionScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FinishTalkMissionScRsp(), data).checkInitialized();
    }

    public static FinishTalkMissionScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FinishTalkMissionScRsp(), input).checkInitialized();
    }

    public static FinishTalkMissionScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FinishTalkMissionScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating FinishTalkMissionScRsp messages
     */
    public static MessageFactory<FinishTalkMissionScRsp> getFactory() {
      return FinishTalkMissionScRspFactory.INSTANCE;
    }

    private enum FinishTalkMissionScRspFactory implements MessageFactory<FinishTalkMissionScRsp> {
      INSTANCE;

      @Override
      public FinishTalkMissionScRsp create() {
        return FinishTalkMissionScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName subMissionId = FieldName.forField("subMissionId", "sub_mission_id");

      static final FieldName talkStr = FieldName.forField("talkStr", "talk_str");

      static final FieldName customValueList = FieldName.forField("customValueList", "custom_value_list");
    }
  }
}
