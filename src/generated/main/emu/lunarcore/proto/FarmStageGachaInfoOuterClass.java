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

public final class FarmStageGachaInfoOuterClass {
  /**
   * Protobuf type {@code FarmStageGachaInfo}
   */
  public static final class FarmStageGachaInfo extends ProtoMessage<FarmStageGachaInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 begin_time = 11;</code>
     */
    private long beginTime;

    /**
     * <code>optional int64 end_time = 14;</code>
     */
    private long endTime;

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     */
    private int gachaId;

    private FarmStageGachaInfo() {
    }

    /**
     * @return a new empty instance of {@code FarmStageGachaInfo}
     */
    public static FarmStageGachaInfo newInstance() {
      return new FarmStageGachaInfo();
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return this
     */
    public FarmStageGachaInfo clearBeginTime() {
      bitField0_ &= ~0x00000001;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @param value the beginTime to set
     * @return this
     */
    public FarmStageGachaInfo setBeginTime(final long value) {
      bitField0_ |= 0x00000001;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @return this
     */
    public FarmStageGachaInfo clearEndTime() {
      bitField0_ &= ~0x00000002;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @param value the endTime to set
     * @return this
     */
    public FarmStageGachaInfo setEndTime(final long value) {
      bitField0_ |= 0x00000002;
      endTime = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @return whether the gachaId field is set
     */
    public boolean hasGachaId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @return this
     */
    public FarmStageGachaInfo clearGachaId() {
      bitField0_ &= ~0x00000004;
      gachaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @return the gachaId
     */
    public int getGachaId() {
      return gachaId;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @param value the gachaId to set
     * @return this
     */
    public FarmStageGachaInfo setGachaId(final int value) {
      bitField0_ |= 0x00000004;
      gachaId = value;
      return this;
    }

    @Override
    public FarmStageGachaInfo copyFrom(final FarmStageGachaInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        beginTime = other.beginTime;
        endTime = other.endTime;
        gachaId = other.gachaId;
      }
      return this;
    }

    @Override
    public FarmStageGachaInfo mergeFrom(final FarmStageGachaInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasGachaId()) {
        setGachaId(other.gachaId);
      }
      return this;
    }

    @Override
    public FarmStageGachaInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      beginTime = 0L;
      endTime = 0L;
      gachaId = 0;
      return this;
    }

    @Override
    public FarmStageGachaInfo clearQuick() {
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
      if (!(o instanceof FarmStageGachaInfo)) {
        return false;
      }
      FarmStageGachaInfo other = (FarmStageGachaInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasGachaId() || gachaId == other.gachaId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(gachaId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FarmStageGachaInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // gachaId
            gachaId = input.readUInt32();
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gachaId, gachaId);
      }
      output.endObject();
    }

    @Override
    public FarmStageGachaInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -204751299:
          case -2052301576: {
            if (input.isAtField(FieldNames.gachaId)) {
              if (!input.trySkipNullValue()) {
                gachaId = input.readUInt32();
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
    public FarmStageGachaInfo clone() {
      return new FarmStageGachaInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FarmStageGachaInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FarmStageGachaInfo(), data).checkInitialized();
    }

    public static FarmStageGachaInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FarmStageGachaInfo(), input).checkInitialized();
    }

    public static FarmStageGachaInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FarmStageGachaInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating FarmStageGachaInfo messages
     */
    public static MessageFactory<FarmStageGachaInfo> getFactory() {
      return FarmStageGachaInfoFactory.INSTANCE;
    }

    private enum FarmStageGachaInfoFactory implements MessageFactory<FarmStageGachaInfo> {
      INSTANCE;

      @Override
      public FarmStageGachaInfo create() {
        return FarmStageGachaInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName gachaId = FieldName.forField("gachaId", "gacha_id");
    }
  }
}
