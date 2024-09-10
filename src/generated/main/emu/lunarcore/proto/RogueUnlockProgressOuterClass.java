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

public final class RogueUnlockProgressOuterClass {
  /**
   * Protobuf type {@code RogueUnlockProgress}
   */
  public static final class RogueUnlockProgress extends ProtoMessage<RogueUnlockProgress> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 UnlockId = 7;</code>
     */
    private int unlockId;

    /**
     * <code>optional uint32 Progress = 13;</code>
     */
    private int progress;

    /**
     * <code>optional bool Finish = 12;</code>
     */
    private boolean finish;

    private RogueUnlockProgress() {
    }

    /**
     * @return a new empty instance of {@code RogueUnlockProgress}
     */
    public static RogueUnlockProgress newInstance() {
      return new RogueUnlockProgress();
    }

    /**
     * <code>optional uint32 UnlockId = 7;</code>
     * @return whether the unlockId field is set
     */
    public boolean hasUnlockId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 UnlockId = 7;</code>
     * @return this
     */
    public RogueUnlockProgress clearUnlockId() {
      bitField0_ &= ~0x00000001;
      unlockId = 0;
      return this;
    }

    /**
     * <code>optional uint32 UnlockId = 7;</code>
     * @return the unlockId
     */
    public int getUnlockId() {
      return unlockId;
    }

    /**
     * <code>optional uint32 UnlockId = 7;</code>
     * @param value the unlockId to set
     * @return this
     */
    public RogueUnlockProgress setUnlockId(final int value) {
      bitField0_ |= 0x00000001;
      unlockId = value;
      return this;
    }

    /**
     * <code>optional uint32 Progress = 13;</code>
     * @return whether the progress field is set
     */
    public boolean hasProgress() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 Progress = 13;</code>
     * @return this
     */
    public RogueUnlockProgress clearProgress() {
      bitField0_ &= ~0x00000002;
      progress = 0;
      return this;
    }

    /**
     * <code>optional uint32 Progress = 13;</code>
     * @return the progress
     */
    public int getProgress() {
      return progress;
    }

    /**
     * <code>optional uint32 Progress = 13;</code>
     * @param value the progress to set
     * @return this
     */
    public RogueUnlockProgress setProgress(final int value) {
      bitField0_ |= 0x00000002;
      progress = value;
      return this;
    }

    /**
     * <code>optional bool Finish = 12;</code>
     * @return whether the finish field is set
     */
    public boolean hasFinish() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool Finish = 12;</code>
     * @return this
     */
    public RogueUnlockProgress clearFinish() {
      bitField0_ &= ~0x00000004;
      finish = false;
      return this;
    }

    /**
     * <code>optional bool Finish = 12;</code>
     * @return the finish
     */
    public boolean getFinish() {
      return finish;
    }

    /**
     * <code>optional bool Finish = 12;</code>
     * @param value the finish to set
     * @return this
     */
    public RogueUnlockProgress setFinish(final boolean value) {
      bitField0_ |= 0x00000004;
      finish = value;
      return this;
    }

    @Override
    public RogueUnlockProgress copyFrom(final RogueUnlockProgress other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        unlockId = other.unlockId;
        progress = other.progress;
        finish = other.finish;
      }
      return this;
    }

    @Override
    public RogueUnlockProgress mergeFrom(final RogueUnlockProgress other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUnlockId()) {
        setUnlockId(other.unlockId);
      }
      if (other.hasProgress()) {
        setProgress(other.progress);
      }
      if (other.hasFinish()) {
        setFinish(other.finish);
      }
      return this;
    }

    @Override
    public RogueUnlockProgress clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockId = 0;
      progress = 0;
      finish = false;
      return this;
    }

    @Override
    public RogueUnlockProgress clearQuick() {
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
      if (!(o instanceof RogueUnlockProgress)) {
        return false;
      }
      RogueUnlockProgress other = (RogueUnlockProgress) o;
      return bitField0_ == other.bitField0_
        && (!hasUnlockId() || unlockId == other.unlockId)
        && (!hasProgress() || progress == other.progress)
        && (!hasFinish() || finish == other.finish);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(unlockId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(progress);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeBoolNoTag(finish);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unlockId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(progress);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueUnlockProgress mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // unlockId
            unlockId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // progress
            progress = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // finish
            finish = input.readBool();
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
        output.writeUInt32(FieldNames.unlockId, unlockId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.progress, progress);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.finish, finish);
      }
      output.endObject();
    }

    @Override
    public RogueUnlockProgress mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -146306145: {
            if (input.isAtField(FieldNames.unlockId)) {
              if (!input.trySkipNullValue()) {
                unlockId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -936434099: {
            if (input.isAtField(FieldNames.progress)) {
              if (!input.trySkipNullValue()) {
                progress = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2104391859: {
            if (input.isAtField(FieldNames.finish)) {
              if (!input.trySkipNullValue()) {
                finish = input.readBool();
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
    public RogueUnlockProgress clone() {
      return new RogueUnlockProgress().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueUnlockProgress parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueUnlockProgress(), data).checkInitialized();
    }

    public static RogueUnlockProgress parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueUnlockProgress(), input).checkInitialized();
    }

    public static RogueUnlockProgress parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueUnlockProgress(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueUnlockProgress messages
     */
    public static MessageFactory<RogueUnlockProgress> getFactory() {
      return RogueUnlockProgressFactory.INSTANCE;
    }

    private enum RogueUnlockProgressFactory implements MessageFactory<RogueUnlockProgress> {
      INSTANCE;

      @Override
      public RogueUnlockProgress create() {
        return RogueUnlockProgress.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName unlockId = FieldName.forField("UnlockId");

      static final FieldName progress = FieldName.forField("Progress");

      static final FieldName finish = FieldName.forField("Finish");
    }
  }
}
