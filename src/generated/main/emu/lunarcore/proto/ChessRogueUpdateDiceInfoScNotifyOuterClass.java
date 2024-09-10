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

public final class ChessRogueUpdateDiceInfoScNotifyOuterClass {
  /**
   * Protobuf type {@code ChessRogueUpdateDiceInfoScNotify}
   */
  public static final class ChessRogueUpdateDiceInfoScNotify extends ProtoMessage<ChessRogueUpdateDiceInfoScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 8;</code>
     */
    private final ChessRogueNousDiceOuterClass.ChessRogueNousDice nousDice = ChessRogueNousDiceOuterClass.ChessRogueNousDice.newInstance();

    private ChessRogueUpdateDiceInfoScNotify() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueUpdateDiceInfoScNotify}
     */
    public static ChessRogueUpdateDiceInfoScNotify newInstance() {
      return new ChessRogueUpdateDiceInfoScNotify();
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 8;</code>
     * @return whether the nousDice field is set
     */
    public boolean hasNousDice() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 8;</code>
     * @return this
     */
    public ChessRogueUpdateDiceInfoScNotify clearNousDice() {
      bitField0_ &= ~0x00000001;
      nousDice.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNousDice()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousDiceOuterClass.ChessRogueNousDice getNousDice() {
      return nousDice;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousDiceOuterClass.ChessRogueNousDice getMutableNousDice() {
      bitField0_ |= 0x00000001;
      return nousDice;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 8;</code>
     * @param value the nousDice to set
     * @return this
     */
    public ChessRogueUpdateDiceInfoScNotify setNousDice(
        final ChessRogueNousDiceOuterClass.ChessRogueNousDice value) {
      bitField0_ |= 0x00000001;
      nousDice.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueUpdateDiceInfoScNotify copyFrom(final ChessRogueUpdateDiceInfoScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        nousDice.copyFrom(other.nousDice);
      }
      return this;
    }

    @Override
    public ChessRogueUpdateDiceInfoScNotify mergeFrom(
        final ChessRogueUpdateDiceInfoScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNousDice()) {
        getMutableNousDice().mergeFrom(other.nousDice);
      }
      return this;
    }

    @Override
    public ChessRogueUpdateDiceInfoScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nousDice.clear();
      return this;
    }

    @Override
    public ChessRogueUpdateDiceInfoScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nousDice.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueUpdateDiceInfoScNotify)) {
        return false;
      }
      ChessRogueUpdateDiceInfoScNotify other = (ChessRogueUpdateDiceInfoScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasNousDice() || nousDice.equals(other.nousDice));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(nousDice);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(nousDice);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueUpdateDiceInfoScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 66: {
            // nousDice
            input.readMessage(nousDice);
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
        output.writeMessage(FieldNames.nousDice, nousDice);
      }
      output.endObject();
    }

    @Override
    public ChessRogueUpdateDiceInfoScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1622214758:
          case -1226158137: {
            if (input.isAtField(FieldNames.nousDice)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(nousDice);
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
    public ChessRogueUpdateDiceInfoScNotify clone() {
      return new ChessRogueUpdateDiceInfoScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueUpdateDiceInfoScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueUpdateDiceInfoScNotify(), data).checkInitialized();
    }

    public static ChessRogueUpdateDiceInfoScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueUpdateDiceInfoScNotify(), input).checkInitialized();
    }

    public static ChessRogueUpdateDiceInfoScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueUpdateDiceInfoScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueUpdateDiceInfoScNotify messages
     */
    public static MessageFactory<ChessRogueUpdateDiceInfoScNotify> getFactory() {
      return ChessRogueUpdateDiceInfoScNotifyFactory.INSTANCE;
    }

    private enum ChessRogueUpdateDiceInfoScNotifyFactory implements MessageFactory<ChessRogueUpdateDiceInfoScNotify> {
      INSTANCE;

      @Override
      public ChessRogueUpdateDiceInfoScNotify create() {
        return ChessRogueUpdateDiceInfoScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName nousDice = FieldName.forField("nousDice", "nous_dice");
    }
  }
}
