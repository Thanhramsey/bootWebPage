$(document).ready(function (){
$('#registerForm').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },
    fields: {
        firstName: {
            validators: {
                notEmpty: {
                    message: 'The First Name is required.'
                },
                regexp: {
                    regexp: /^[a-zA-Z]{1,20}$/,
                    message: 'The First Name is invalid.'
                }
            }
        },
        lastName: {
            validators: {
                notEmpty: {
                    message: 'The Last Name is required.'
                },
                regexp: {
                    regexp: /^[a-zA-Z]{1,20}$/,
                    message: 'The Last Name is invalid.'
                }
            }
        },
        dayOfBirth: {
            validators: {
                notEmpty: {
                    message: 'The Date of Birth is required.'
                },
            }
        },
        address: {
            validators: {
                notEmpty: {
                    message: 'The Address is required.'
                }
            }
        },
        phone: {
            validators: {
                notEmpty: {
                    message: 'The Phone Number is required.'
                },
                callback: {
                    message: 'The Phone Number is required.',
                    callback: function (value, validator, $field) {
                        var isValid = value.match(/^[0-9 -]*$/);
                        var str = getValidNumberPhone(value);
                        if(value == "") {
                            return {
                                valid: false,
                                message: 'The Phone Number is required.'
                            };
                        }
                        else if(!isValid) {
                            return {
                                valid: false,
                                message: 'The Phone Number is invalid.'
                            };
                        } else if(str.length != 10) {
                            return {
                                valid: false,
                                message: 'It must be contained 10 digits'
                            };
                        }
                        return true;
                    }
                }
            }
        },
    }
}).on('error.validator.bv', function (e, data) {

    data.element
        .data('bv.messages')
        .find('.help-block[data-bv-for="' + data.field + '"]').hide()
        .filter('[data-bv-validator="' + data.validator + '"]').show();
});
});

function getValidNumberPhone(value) {
    return value.replace(/[^0-9]/g, '');
}
