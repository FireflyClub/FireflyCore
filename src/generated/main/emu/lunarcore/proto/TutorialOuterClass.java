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

public final class TutorialOuterClass {
  /**
   * Protobuf type {@code Tutorial}
   */
  public static final class Tutorial extends ProtoMessage<Tutorial> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 Id = 11;</code>
     */
    private int id;

    /**
     * <code>optional .TutorialStatus Status = 7;</code>
     */
    private int status;

    private Tutorial() {
    }

    /**
     * @return a new empty instance of {@code Tutorial}
     */
    public static Tutorial newInstance() {
      return new Tutorial();
    }

    /**
     * <code>optional uint32 Id = 11;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 Id = 11;</code>
     * @return this
     */
    public Tutorial clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 Id = 11;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 Id = 11;</code>
     * @param value the id to set
     * @return this
     */
    public Tutorial setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    /**
     * <code>optional .TutorialStatus Status = 7;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .TutorialStatus Status = 7;</code>
     * @return this
     */
    public Tutorial clearStatus() {
      bitField0_ &= ~0x00000002;
      status = 0;
      return this;
    }

    /**
     * <code>optional .TutorialStatus Status = 7;</code>
     * @return the status
     */
    public TutorialStatusOuterClass.TutorialStatus getStatus() {
      return TutorialStatusOuterClass.TutorialStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link Tutorial#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link TutorialStatusOuterClass.TutorialStatus}. Setting an invalid value
     * can cause {@link Tutorial#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public Tutorial setStatusValue(final int value) {
      bitField0_ |= 0x00000002;
      status = value;
      return this;
    }

    /**
     * <code>optional .TutorialStatus Status = 7;</code>
     * @param value the status to set
     * @return this
     */
    public Tutorial setStatus(final TutorialStatusOuterClass.TutorialStatus value) {
      bitField0_ |= 0x00000002;
      status = value.getNumber();
      return this;
    }

    @Override
    public Tutorial copyFrom(final Tutorial other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
        status = other.status;
      }
      return this;
    }

    @Override
    public Tutorial mergeFrom(final Tutorial other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      return this;
    }

    @Override
    public Tutorial clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      status = 0;
      return this;
    }

    @Override
    public Tutorial clearQuick() {
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
      if (!(o instanceof Tutorial)) {
        return false;
      }
      Tutorial other = (Tutorial) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id)
        && (!hasStatus() || status == other.status);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeEnumNoTag(status);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Tutorial mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // status
            final int value = input.readInt32();
            if (TutorialStatusOuterClass.TutorialStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000002;
            }
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
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.status, status, TutorialStatusOuterClass.TutorialStatus.converter());
      }
      output.endObject();
    }

    @Override
    public Tutorial mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2363: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1808614382: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final TutorialStatusOuterClass.TutorialStatus value = input.readEnum(TutorialStatusOuterClass.TutorialStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public Tutorial clone() {
      return new Tutorial().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Tutorial parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Tutorial(), data).checkInitialized();
    }

    public static Tutorial parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Tutorial(), input).checkInitialized();
    }

    public static Tutorial parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Tutorial(), input).checkInitialized();
    }

    /**
     * @return factory for creating Tutorial messages
     */
    public static MessageFactory<Tutorial> getFactory() {
      return TutorialFactory.INSTANCE;
    }

    private enum TutorialFactory implements MessageFactory<Tutorial> {
      INSTANCE;

      @Override
      public Tutorial create() {
        return Tutorial.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("Id");

      static final FieldName status = FieldName.forField("Status");
    }
  }
}
