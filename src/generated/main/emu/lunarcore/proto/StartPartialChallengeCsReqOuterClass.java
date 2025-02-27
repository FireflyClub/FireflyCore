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

public final class StartPartialChallengeCsReqOuterClass {
  /**
   * Protobuf type {@code StartPartialChallengeCsReq}
   */
  public static final class StartPartialChallengeCsReq extends ProtoMessage<StartPartialChallengeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 challenge_id = 9;</code>
     */
    private int challengeId;

    /**
     * <code>optional uint32 buff_id = 11;</code>
     */
    private int buffId;

    /**
     * <code>optional bool is_first_half = 7;</code>
     */
    private boolean isFirstHalf;

    private StartPartialChallengeCsReq() {
    }

    /**
     * @return a new empty instance of {@code StartPartialChallengeCsReq}
     */
    public static StartPartialChallengeCsReq newInstance() {
      return new StartPartialChallengeCsReq();
    }

    /**
     * <code>optional uint32 challenge_id = 9;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 9;</code>
     * @return this
     */
    public StartPartialChallengeCsReq clearChallengeId() {
      bitField0_ &= ~0x00000001;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 9;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 9;</code>
     * @param value the challengeId to set
     * @return this
     */
    public StartPartialChallengeCsReq setChallengeId(final int value) {
      bitField0_ |= 0x00000001;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @return whether the buffId field is set
     */
    public boolean hasBuffId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @return this
     */
    public StartPartialChallengeCsReq clearBuffId() {
      bitField0_ &= ~0x00000002;
      buffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @return the buffId
     */
    public int getBuffId() {
      return buffId;
    }

    /**
     * <code>optional uint32 buff_id = 11;</code>
     * @param value the buffId to set
     * @return this
     */
    public StartPartialChallengeCsReq setBuffId(final int value) {
      bitField0_ |= 0x00000002;
      buffId = value;
      return this;
    }

    /**
     * <code>optional bool is_first_half = 7;</code>
     * @return whether the isFirstHalf field is set
     */
    public boolean hasIsFirstHalf() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_first_half = 7;</code>
     * @return this
     */
    public StartPartialChallengeCsReq clearIsFirstHalf() {
      bitField0_ &= ~0x00000004;
      isFirstHalf = false;
      return this;
    }

    /**
     * <code>optional bool is_first_half = 7;</code>
     * @return the isFirstHalf
     */
    public boolean getIsFirstHalf() {
      return isFirstHalf;
    }

    /**
     * <code>optional bool is_first_half = 7;</code>
     * @param value the isFirstHalf to set
     * @return this
     */
    public StartPartialChallengeCsReq setIsFirstHalf(final boolean value) {
      bitField0_ |= 0x00000004;
      isFirstHalf = value;
      return this;
    }

    @Override
    public StartPartialChallengeCsReq copyFrom(final StartPartialChallengeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        challengeId = other.challengeId;
        buffId = other.buffId;
        isFirstHalf = other.isFirstHalf;
      }
      return this;
    }

    @Override
    public StartPartialChallengeCsReq mergeFrom(final StartPartialChallengeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasBuffId()) {
        setBuffId(other.buffId);
      }
      if (other.hasIsFirstHalf()) {
        setIsFirstHalf(other.isFirstHalf);
      }
      return this;
    }

    @Override
    public StartPartialChallengeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeId = 0;
      buffId = 0;
      isFirstHalf = false;
      return this;
    }

    @Override
    public StartPartialChallengeCsReq clearQuick() {
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
      if (!(o instanceof StartPartialChallengeCsReq)) {
        return false;
      }
      StartPartialChallengeCsReq other = (StartPartialChallengeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasBuffId() || buffId == other.buffId)
        && (!hasIsFirstHalf() || isFirstHalf == other.isFirstHalf);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(buffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 56);
        output.writeBoolNoTag(isFirstHalf);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartPartialChallengeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // buffId
            buffId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // isFirstHalf
            isFirstHalf = input.readBool();
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
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.buffId, buffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isFirstHalf, isFirstHalf);
      }
      output.endObject();
    }

    @Override
    public StartPartialChallengeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1378119474:
          case 227990663: {
            if (input.isAtField(FieldNames.buffId)) {
              if (!input.trySkipNullValue()) {
                buffId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1311076601:
          case 2144214679: {
            if (input.isAtField(FieldNames.isFirstHalf)) {
              if (!input.trySkipNullValue()) {
                isFirstHalf = input.readBool();
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
    public StartPartialChallengeCsReq clone() {
      return new StartPartialChallengeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartPartialChallengeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartPartialChallengeCsReq(), data).checkInitialized();
    }

    public static StartPartialChallengeCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartPartialChallengeCsReq(), input).checkInitialized();
    }

    public static StartPartialChallengeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartPartialChallengeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartPartialChallengeCsReq messages
     */
    public static MessageFactory<StartPartialChallengeCsReq> getFactory() {
      return StartPartialChallengeCsReqFactory.INSTANCE;
    }

    private enum StartPartialChallengeCsReqFactory implements MessageFactory<StartPartialChallengeCsReq> {
      INSTANCE;

      @Override
      public StartPartialChallengeCsReq create() {
        return StartPartialChallengeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName buffId = FieldName.forField("buffId", "buff_id");

      static final FieldName isFirstHalf = FieldName.forField("isFirstHalf", "is_first_half");
    }
  }
}
