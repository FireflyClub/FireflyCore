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

public final class GetFirstTalkByPerformanceNpcScRspOuterClass {
  /**
   * Protobuf type {@code GetFirstTalkByPerformanceNpcScRsp}
   */
  public static final class GetFirstTalkByPerformanceNpcScRsp extends ProtoMessage<GetFirstTalkByPerformanceNpcScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 12;</code>
     */
    private int retcode;

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     */
    private final RepeatedMessage<NpcTalkInfoOuterClass.NpcTalkInfo> npcTalkInfoList = RepeatedMessage.newEmptyInstance(NpcTalkInfoOuterClass.NpcTalkInfo.getFactory());

    private GetFirstTalkByPerformanceNpcScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFirstTalkByPerformanceNpcScRsp}
     */
    public static GetFirstTalkByPerformanceNpcScRsp newInstance() {
      return new GetFirstTalkByPerformanceNpcScRsp();
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return this
     */
    public GetFirstTalkByPerformanceNpcScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetFirstTalkByPerformanceNpcScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     * @return whether the npcTalkInfoList field is set
     */
    public boolean hasNpcTalkInfoList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     * @return this
     */
    public GetFirstTalkByPerformanceNpcScRsp clearNpcTalkInfoList() {
      bitField0_ &= ~0x00000002;
      npcTalkInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNpcTalkInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<NpcTalkInfoOuterClass.NpcTalkInfo> getNpcTalkInfoList() {
      return npcTalkInfoList;
    }

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<NpcTalkInfoOuterClass.NpcTalkInfo> getMutableNpcTalkInfoList() {
      bitField0_ |= 0x00000002;
      return npcTalkInfoList;
    }

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     * @param value the npcTalkInfoList to add
     * @return this
     */
    public GetFirstTalkByPerformanceNpcScRsp addNpcTalkInfoList(
        final NpcTalkInfoOuterClass.NpcTalkInfo value) {
      bitField0_ |= 0x00000002;
      npcTalkInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .NpcTalkInfo npc_talk_info_list = 6;</code>
     * @param values the npcTalkInfoList to add
     * @return this
     */
    public GetFirstTalkByPerformanceNpcScRsp addAllNpcTalkInfoList(
        final NpcTalkInfoOuterClass.NpcTalkInfo... values) {
      bitField0_ |= 0x00000002;
      npcTalkInfoList.addAll(values);
      return this;
    }

    @Override
    public GetFirstTalkByPerformanceNpcScRsp copyFrom(
        final GetFirstTalkByPerformanceNpcScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        npcTalkInfoList.copyFrom(other.npcTalkInfoList);
      }
      return this;
    }

    @Override
    public GetFirstTalkByPerformanceNpcScRsp mergeFrom(
        final GetFirstTalkByPerformanceNpcScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasNpcTalkInfoList()) {
        getMutableNpcTalkInfoList().addAll(other.npcTalkInfoList);
      }
      return this;
    }

    @Override
    public GetFirstTalkByPerformanceNpcScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      npcTalkInfoList.clear();
      return this;
    }

    @Override
    public GetFirstTalkByPerformanceNpcScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      npcTalkInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFirstTalkByPerformanceNpcScRsp)) {
        return false;
      }
      GetFirstTalkByPerformanceNpcScRsp other = (GetFirstTalkByPerformanceNpcScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasNpcTalkInfoList() || npcTalkInfoList.equals(other.npcTalkInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < npcTalkInfoList.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(npcTalkInfoList.get(i));
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
        size += (1 * npcTalkInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(npcTalkInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFirstTalkByPerformanceNpcScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // npcTalkInfoList
            tag = input.readRepeatedMessage(npcTalkInfoList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeRepeatedMessage(FieldNames.npcTalkInfoList, npcTalkInfoList);
      }
      output.endObject();
    }

    @Override
    public GetFirstTalkByPerformanceNpcScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1326095175:
          case 2015989466: {
            if (input.isAtField(FieldNames.npcTalkInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(npcTalkInfoList);
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
    public GetFirstTalkByPerformanceNpcScRsp clone() {
      return new GetFirstTalkByPerformanceNpcScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFirstTalkByPerformanceNpcScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFirstTalkByPerformanceNpcScRsp(), data).checkInitialized();
    }

    public static GetFirstTalkByPerformanceNpcScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetFirstTalkByPerformanceNpcScRsp(), input).checkInitialized();
    }

    public static GetFirstTalkByPerformanceNpcScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetFirstTalkByPerformanceNpcScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFirstTalkByPerformanceNpcScRsp messages
     */
    public static MessageFactory<GetFirstTalkByPerformanceNpcScRsp> getFactory() {
      return GetFirstTalkByPerformanceNpcScRspFactory.INSTANCE;
    }

    private enum GetFirstTalkByPerformanceNpcScRspFactory implements MessageFactory<GetFirstTalkByPerformanceNpcScRsp> {
      INSTANCE;

      @Override
      public GetFirstTalkByPerformanceNpcScRsp create() {
        return GetFirstTalkByPerformanceNpcScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName npcTalkInfoList = FieldName.forField("npcTalkInfoList", "npc_talk_info_list");
    }
  }
}
