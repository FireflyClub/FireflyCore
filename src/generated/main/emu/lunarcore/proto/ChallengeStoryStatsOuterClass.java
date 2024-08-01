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

public final class ChallengeStoryStatsOuterClass {
  /**
   * Protobuf type {@code ChallengeStoryStats}
   */
  public static final class ChallengeStoryStats extends ProtoMessage<ChallengeStoryStats> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 attempts = 15;</code>
     */
    private int attempts;

    /**
     * <code>optional .ChallengeStoryClearInfo clear_info = 4;</code>
     */
    private final ChallengeStoryClearInfoOuterClass.ChallengeStoryClearInfo clearInfo = ChallengeStoryClearInfoOuterClass.ChallengeStoryClearInfo.newInstance();

    private ChallengeStoryStats() {
    }

    /**
     * @return a new empty instance of {@code ChallengeStoryStats}
     */
    public static ChallengeStoryStats newInstance() {
      return new ChallengeStoryStats();
    }

    /**
     * <code>optional uint32 attempts = 15;</code>
     * @return whether the attempts field is set
     */
    public boolean hasAttempts() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 attempts = 15;</code>
     * @return this
     */
    public ChallengeStoryStats clearAttempts() {
      bitField0_ &= ~0x00000001;
      attempts = 0;
      return this;
    }

    /**
     * <code>optional uint32 attempts = 15;</code>
     * @return the attempts
     */
    public int getAttempts() {
      return attempts;
    }

    /**
     * <code>optional uint32 attempts = 15;</code>
     * @param value the attempts to set
     * @return this
     */
    public ChallengeStoryStats setAttempts(final int value) {
      bitField0_ |= 0x00000001;
      attempts = value;
      return this;
    }

    /**
     * <code>optional .ChallengeStoryClearInfo clear_info = 4;</code>
     * @return whether the clearInfo field is set
     */
    public boolean hasClearInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChallengeStoryClearInfo clear_info = 4;</code>
     * @return this
     */
    public ChallengeStoryStats clearClearInfo() {
      bitField0_ &= ~0x00000002;
      clearInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeStoryClearInfo clear_info = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableClearInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeStoryClearInfoOuterClass.ChallengeStoryClearInfo getClearInfo() {
      return clearInfo;
    }

    /**
     * <code>optional .ChallengeStoryClearInfo clear_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeStoryClearInfoOuterClass.ChallengeStoryClearInfo getMutableClearInfo() {
      bitField0_ |= 0x00000002;
      return clearInfo;
    }

    /**
     * <code>optional .ChallengeStoryClearInfo clear_info = 4;</code>
     * @param value the clearInfo to set
     * @return this
     */
    public ChallengeStoryStats setClearInfo(
        final ChallengeStoryClearInfoOuterClass.ChallengeStoryClearInfo value) {
      bitField0_ |= 0x00000002;
      clearInfo.copyFrom(value);
      return this;
    }

    @Override
    public ChallengeStoryStats copyFrom(final ChallengeStoryStats other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        attempts = other.attempts;
        clearInfo.copyFrom(other.clearInfo);
      }
      return this;
    }

    @Override
    public ChallengeStoryStats mergeFrom(final ChallengeStoryStats other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAttempts()) {
        setAttempts(other.attempts);
      }
      if (other.hasClearInfo()) {
        getMutableClearInfo().mergeFrom(other.clearInfo);
      }
      return this;
    }

    @Override
    public ChallengeStoryStats clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      attempts = 0;
      clearInfo.clear();
      return this;
    }

    @Override
    public ChallengeStoryStats clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      clearInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeStoryStats)) {
        return false;
      }
      ChallengeStoryStats other = (ChallengeStoryStats) o;
      return bitField0_ == other.bitField0_
        && (!hasAttempts() || attempts == other.attempts)
        && (!hasClearInfo() || clearInfo.equals(other.clearInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(attempts);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(clearInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(attempts);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(clearInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeStoryStats mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 120: {
            // attempts
            attempts = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // clearInfo
            input.readMessage(clearInfo);
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
        output.writeUInt32(FieldNames.attempts, attempts);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.clearInfo, clearInfo);
      }
      output.endObject();
    }

    @Override
    public ChallengeStoryStats mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 542738246: {
            if (input.isAtField(FieldNames.attempts)) {
              if (!input.trySkipNullValue()) {
                attempts = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1271226213:
          case -733130912: {
            if (input.isAtField(FieldNames.clearInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(clearInfo);
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
    public ChallengeStoryStats clone() {
      return new ChallengeStoryStats().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeStoryStats parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeStoryStats(), data).checkInitialized();
    }

    public static ChallengeStoryStats parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryStats(), input).checkInitialized();
    }

    public static ChallengeStoryStats parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryStats(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeStoryStats messages
     */
    public static MessageFactory<ChallengeStoryStats> getFactory() {
      return ChallengeStoryStatsFactory.INSTANCE;
    }

    private enum ChallengeStoryStatsFactory implements MessageFactory<ChallengeStoryStats> {
      INSTANCE;

      @Override
      public ChallengeStoryStats create() {
        return ChallengeStoryStats.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName attempts = FieldName.forField("attempts");

      static final FieldName clearInfo = FieldName.forField("clearInfo", "clear_info");
    }
  }
}
