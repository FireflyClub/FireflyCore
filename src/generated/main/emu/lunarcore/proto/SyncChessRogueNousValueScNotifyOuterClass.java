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

public final class SyncChessRogueNousValueScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncChessRogueNousValueScNotify}
   */
  public static final class SyncChessRogueNousValueScNotify extends ProtoMessage<SyncChessRogueNousValueScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ChessRogueNousValue nous_value = 3;</code>
     */
    private final ChessRogueNousValueOuterClass.ChessRogueNousValue nousValue = ChessRogueNousValueOuterClass.ChessRogueNousValue.newInstance();

    private SyncChessRogueNousValueScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncChessRogueNousValueScNotify}
     */
    public static SyncChessRogueNousValueScNotify newInstance() {
      return new SyncChessRogueNousValueScNotify();
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 3;</code>
     * @return whether the nousValue field is set
     */
    public boolean hasNousValue() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 3;</code>
     * @return this
     */
    public SyncChessRogueNousValueScNotify clearNousValue() {
      bitField0_ &= ~0x00000001;
      nousValue.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNousValue()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousValueOuterClass.ChessRogueNousValue getNousValue() {
      return nousValue;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousValueOuterClass.ChessRogueNousValue getMutableNousValue() {
      bitField0_ |= 0x00000001;
      return nousValue;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 3;</code>
     * @param value the nousValue to set
     * @return this
     */
    public SyncChessRogueNousValueScNotify setNousValue(
        final ChessRogueNousValueOuterClass.ChessRogueNousValue value) {
      bitField0_ |= 0x00000001;
      nousValue.copyFrom(value);
      return this;
    }

    @Override
    public SyncChessRogueNousValueScNotify copyFrom(final SyncChessRogueNousValueScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        nousValue.copyFrom(other.nousValue);
      }
      return this;
    }

    @Override
    public SyncChessRogueNousValueScNotify mergeFrom(final SyncChessRogueNousValueScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNousValue()) {
        getMutableNousValue().mergeFrom(other.nousValue);
      }
      return this;
    }

    @Override
    public SyncChessRogueNousValueScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nousValue.clear();
      return this;
    }

    @Override
    public SyncChessRogueNousValueScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nousValue.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncChessRogueNousValueScNotify)) {
        return false;
      }
      SyncChessRogueNousValueScNotify other = (SyncChessRogueNousValueScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasNousValue() || nousValue.equals(other.nousValue));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(nousValue);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(nousValue);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncChessRogueNousValueScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 26: {
            // nousValue
            input.readMessage(nousValue);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.nousValue, nousValue);
      }
      output.endObject();
    }

    @Override
    public SyncChessRogueNousValueScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1234555758:
          case 660197713: {
            if (input.isAtField(FieldNames.nousValue)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(nousValue);
                bitField0_ |= 0x00000001;
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
    public SyncChessRogueNousValueScNotify clone() {
      return new SyncChessRogueNousValueScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncChessRogueNousValueScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncChessRogueNousValueScNotify(), data).checkInitialized();
    }

    public static SyncChessRogueNousValueScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncChessRogueNousValueScNotify(), input).checkInitialized();
    }

    public static SyncChessRogueNousValueScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncChessRogueNousValueScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncChessRogueNousValueScNotify messages
     */
    public static MessageFactory<SyncChessRogueNousValueScNotify> getFactory() {
      return SyncChessRogueNousValueScNotifyFactory.INSTANCE;
    }

    private enum SyncChessRogueNousValueScNotifyFactory implements MessageFactory<SyncChessRogueNousValueScNotify> {
      INSTANCE;

      @Override
      public SyncChessRogueNousValueScNotify create() {
        return SyncChessRogueNousValueScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName nousValue = FieldName.forField("nousValue", "nous_value");
    }
  }
}
