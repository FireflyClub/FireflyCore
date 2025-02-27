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

public final class StartChallengeStoryBuffInfoOuterClass {
  /**
   * Protobuf type {@code StartChallengeStoryBuffInfo}
   */
  public static final class StartChallengeStoryBuffInfo extends ProtoMessage<StartChallengeStoryBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 buff_two = 4;</code>
     */
    private int buffTwo;

    /**
     * <code>optional uint32 buff_one = 8;</code>
     */
    private int buffOne;

    private StartChallengeStoryBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code StartChallengeStoryBuffInfo}
     */
    public static StartChallengeStoryBuffInfo newInstance() {
      return new StartChallengeStoryBuffInfo();
    }

    /**
     * <code>optional uint32 buff_two = 4;</code>
     * @return whether the buffTwo field is set
     */
    public boolean hasBuffTwo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 buff_two = 4;</code>
     * @return this
     */
    public StartChallengeStoryBuffInfo clearBuffTwo() {
      bitField0_ &= ~0x00000001;
      buffTwo = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_two = 4;</code>
     * @return the buffTwo
     */
    public int getBuffTwo() {
      return buffTwo;
    }

    /**
     * <code>optional uint32 buff_two = 4;</code>
     * @param value the buffTwo to set
     * @return this
     */
    public StartChallengeStoryBuffInfo setBuffTwo(final int value) {
      bitField0_ |= 0x00000001;
      buffTwo = value;
      return this;
    }

    /**
     * <code>optional uint32 buff_one = 8;</code>
     * @return whether the buffOne field is set
     */
    public boolean hasBuffOne() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 buff_one = 8;</code>
     * @return this
     */
    public StartChallengeStoryBuffInfo clearBuffOne() {
      bitField0_ &= ~0x00000002;
      buffOne = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_one = 8;</code>
     * @return the buffOne
     */
    public int getBuffOne() {
      return buffOne;
    }

    /**
     * <code>optional uint32 buff_one = 8;</code>
     * @param value the buffOne to set
     * @return this
     */
    public StartChallengeStoryBuffInfo setBuffOne(final int value) {
      bitField0_ |= 0x00000002;
      buffOne = value;
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo copyFrom(final StartChallengeStoryBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffTwo = other.buffTwo;
        buffOne = other.buffOne;
      }
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo mergeFrom(final StartChallengeStoryBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffTwo()) {
        setBuffTwo(other.buffTwo);
      }
      if (other.hasBuffOne()) {
        setBuffOne(other.buffOne);
      }
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffTwo = 0;
      buffOne = 0;
      return this;
    }

    @Override
    public StartChallengeStoryBuffInfo clearQuick() {
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
      if (!(o instanceof StartChallengeStoryBuffInfo)) {
        return false;
      }
      StartChallengeStoryBuffInfo other = (StartChallengeStoryBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffTwo() || buffTwo == other.buffTwo)
        && (!hasBuffOne() || buffOne == other.buffOne);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(buffTwo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(buffOne);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffTwo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffOne);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartChallengeStoryBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // buffTwo
            buffTwo = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // buffOne
            buffOne = input.readUInt32();
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
        output.writeUInt32(FieldNames.buffTwo, buffTwo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.buffOne, buffOne);
      }
      output.endObject();
    }

    @Override
    public StartChallengeStoryBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 227980537:
          case -1522212768: {
            if (input.isAtField(FieldNames.buffTwo)) {
              if (!input.trySkipNullValue()) {
                buffTwo = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 227975443:
          case -1522217862: {
            if (input.isAtField(FieldNames.buffOne)) {
              if (!input.trySkipNullValue()) {
                buffOne = input.readUInt32();
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
    public StartChallengeStoryBuffInfo clone() {
      return new StartChallengeStoryBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartChallengeStoryBuffInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryBuffInfo(), data).checkInitialized();
    }

    public static StartChallengeStoryBuffInfo parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryBuffInfo(), input).checkInitialized();
    }

    public static StartChallengeStoryBuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartChallengeStoryBuffInfo messages
     */
    public static MessageFactory<StartChallengeStoryBuffInfo> getFactory() {
      return StartChallengeStoryBuffInfoFactory.INSTANCE;
    }

    private enum StartChallengeStoryBuffInfoFactory implements MessageFactory<StartChallengeStoryBuffInfo> {
      INSTANCE;

      @Override
      public StartChallengeStoryBuffInfo create() {
        return StartChallengeStoryBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffTwo = FieldName.forField("buffTwo", "buff_two");

      static final FieldName buffOne = FieldName.forField("buffOne", "buff_one");
    }
  }
}
