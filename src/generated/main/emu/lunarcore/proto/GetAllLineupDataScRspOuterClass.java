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

public final class GetAllLineupDataScRspOuterClass {
  /**
   * Protobuf type {@code GetAllLineupDataScRsp}
   */
  public static final class GetAllLineupDataScRsp extends ProtoMessage<GetAllLineupDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 cur_index = 10;</code>
     */
    private int curIndex;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     */
    private final RepeatedMessage<LineupInfoOuterClass.LineupInfo> lineupList = RepeatedMessage.newEmptyInstance(LineupInfoOuterClass.LineupInfo.getFactory());

    private GetAllLineupDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetAllLineupDataScRsp}
     */
    public static GetAllLineupDataScRsp newInstance() {
      return new GetAllLineupDataScRsp();
    }

    /**
     * <code>optional uint32 cur_index = 10;</code>
     * @return whether the curIndex field is set
     */
    public boolean hasCurIndex() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 cur_index = 10;</code>
     * @return this
     */
    public GetAllLineupDataScRsp clearCurIndex() {
      bitField0_ &= ~0x00000001;
      curIndex = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_index = 10;</code>
     * @return the curIndex
     */
    public int getCurIndex() {
      return curIndex;
    }

    /**
     * <code>optional uint32 cur_index = 10;</code>
     * @param value the curIndex to set
     * @return this
     */
    public GetAllLineupDataScRsp setCurIndex(final int value) {
      bitField0_ |= 0x00000001;
      curIndex = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public GetAllLineupDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
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
    public GetAllLineupDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     * @return whether the lineupList field is set
     */
    public boolean hasLineupList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     * @return this
     */
    public GetAllLineupDataScRsp clearLineupList() {
      bitField0_ &= ~0x00000004;
      lineupList.clear();
      return this;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineupList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<LineupInfoOuterClass.LineupInfo> getLineupList() {
      return lineupList;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<LineupInfoOuterClass.LineupInfo> getMutableLineupList() {
      bitField0_ |= 0x00000004;
      return lineupList;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     * @param value the lineupList to add
     * @return this
     */
    public GetAllLineupDataScRsp addLineupList(final LineupInfoOuterClass.LineupInfo value) {
      bitField0_ |= 0x00000004;
      lineupList.add(value);
      return this;
    }

    /**
     * <code>repeated .LineupInfo lineup_list = 5;</code>
     * @param values the lineupList to add
     * @return this
     */
    public GetAllLineupDataScRsp addAllLineupList(final LineupInfoOuterClass.LineupInfo... values) {
      bitField0_ |= 0x00000004;
      lineupList.addAll(values);
      return this;
    }

    @Override
    public GetAllLineupDataScRsp copyFrom(final GetAllLineupDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curIndex = other.curIndex;
        retcode = other.retcode;
        lineupList.copyFrom(other.lineupList);
      }
      return this;
    }

    @Override
    public GetAllLineupDataScRsp mergeFrom(final GetAllLineupDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurIndex()) {
        setCurIndex(other.curIndex);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasLineupList()) {
        getMutableLineupList().addAll(other.lineupList);
      }
      return this;
    }

    @Override
    public GetAllLineupDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curIndex = 0;
      retcode = 0;
      lineupList.clear();
      return this;
    }

    @Override
    public GetAllLineupDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lineupList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetAllLineupDataScRsp)) {
        return false;
      }
      GetAllLineupDataScRsp other = (GetAllLineupDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasCurIndex() || curIndex == other.curIndex)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasLineupList() || lineupList.equals(other.lineupList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(curIndex);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < lineupList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(lineupList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curIndex);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * lineupList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(lineupList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetAllLineupDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // curIndex
            curIndex = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // lineupList
            tag = input.readRepeatedMessage(lineupList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.curIndex, curIndex);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.lineupList, lineupList);
      }
      output.endObject();
    }

    @Override
    public GetAllLineupDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 537796210:
          case 117333523: {
            if (input.isAtField(FieldNames.curIndex)) {
              if (!input.trySkipNullValue()) {
                curIndex = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 781801165:
          case -1516340914: {
            if (input.isAtField(FieldNames.lineupList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(lineupList);
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
    public GetAllLineupDataScRsp clone() {
      return new GetAllLineupDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetAllLineupDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetAllLineupDataScRsp(), data).checkInitialized();
    }

    public static GetAllLineupDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetAllLineupDataScRsp(), input).checkInitialized();
    }

    public static GetAllLineupDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetAllLineupDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetAllLineupDataScRsp messages
     */
    public static MessageFactory<GetAllLineupDataScRsp> getFactory() {
      return GetAllLineupDataScRspFactory.INSTANCE;
    }

    private enum GetAllLineupDataScRspFactory implements MessageFactory<GetAllLineupDataScRsp> {
      INSTANCE;

      @Override
      public GetAllLineupDataScRsp create() {
        return GetAllLineupDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curIndex = FieldName.forField("curIndex", "cur_index");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName lineupList = FieldName.forField("lineupList", "lineup_list");
    }
  }
}
